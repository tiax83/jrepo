package com.lm.test_taxes;

import com.lm.test_taxes.bean.Basket;
import com.lm.test_taxes.bean.Good;
import com.lm.test_taxes.bean.Receipt;
import com.lm.test_taxes.constants.Constants;

/**
 * Hello world!
 *
 */
public class Main  {
	public static void main(String[] args) {
		//example with INPUT 1
		//input
		Basket basket = new Basket();
		Good good = new Good();
		good.setName("book");
		good.setDesc("book");
		good.setType(Constants.GOOD_TYPE_BOOK);
		good.setImported(false);
		good.setPrice(12.49);
		basket.getGoods().add(good);
		
		good = new Good();
		good.setName("cd");
		good.setDesc("music cd");
		good.setType(Constants.GOOD_TYPE_OTHER);
		good.setImported(false);
		good.setPrice(14.99);
		basket.getGoods().add(good);

		good = new Good();
		good.setName("bar");
		good.setDesc("chocolate bar");
		good.setType(Constants.GOOD_TYPE_FOOD);
		good.setImported(false);
		good.setPrice(.85);
		basket.getGoods().add(good);
		
		boolean result = calcTaxes(basket);
	}
	
	public static boolean calcTaxes(Basket basket){
		boolean retValue = true;
		
		//apply taxes
		Receipt receipt = new Receipt();
		Double totTaxes = 0.0;
		Double total = 0.0;
		for (Good g : basket.getGoods()){
			String type = g.getType();
			Double price = g.getPrice();
			Double basicTax = 0.0;
			if (!type.equals(Constants.GOOD_TYPE_BOOK) && !type.equals(Constants.GOOD_TYPE_FOOD) && !type.equals(Constants.GOOD_TYPE_MEDICAL)){
				basicTax = Math.round((price*10/100) * 20.0) / 20.0;
				g.setGrossPrice(price + basicTax);
			} else {
				g.setGrossPrice(price);
			}
			Double importTax = 0.0;
			Double grossPrice = g.getGrossPrice();
			if (g.getImported()){
				importTax = Math.round((price*5/100) * 20.0) / 20.0;
				g.setGrossPrice(grossPrice + importTax);
			}
			receipt.getGoods().add(g);
			totTaxes += basicTax + importTax;
			total += g.getGrossPrice();
		}
		receipt.setTotTaxes(totTaxes);
		receipt.setTotal(total);
		
		//output
		for (Good g : receipt.getGoods()){
			System.out.println("1 " + (g.getImported() ? "imported " : "") + g.getDesc() + ": " + String.format("%.02f", g.getGrossPrice()));
		}
		System.out.println("Sales taxes: " + String.format("%.02f", receipt.getTotTaxes()));
		System.out.println("Total: " + String.format("%.02f", receipt.getTotal()));
		System.out.println("");
		
		return retValue;
	}

}
