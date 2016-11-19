package com.lm.test_taxes;

import com.lm.test_taxes.bean.Basket;
import com.lm.test_taxes.bean.Good;
import com.lm.test_taxes.constants.Constants;

public class Test {
	@org.junit.Test
	public void test1() {
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
		
		boolean result = Main.calcTaxes(basket);
		assert(result);
	}

	@org.junit.Test
	public void test2() {
		Basket basket = new Basket();
		Good good = new Good();
		good.setName("box");
		good.setDesc("box of chocolates");
		good.setType(Constants.GOOD_TYPE_FOOD);
		good.setImported(true);
		good.setPrice(10.00);
		basket.getGoods().add(good);
		
		good = new Good();
		good.setName("bottle");
		good.setDesc("bottle of perfume");
		good.setType(Constants.GOOD_TYPE_OTHER);
		good.setImported(true);
		good.setPrice(47.50);
		basket.getGoods().add(good);

		boolean result = Main.calcTaxes(basket);
		assert(result);
	}

	@org.junit.Test
	public void test3() {
		Basket basket = new Basket();
		Good good = new Good();
		good.setName("bottle");
		good.setDesc("bottle of perfume");
		good.setType(Constants.GOOD_TYPE_OTHER);
		good.setImported(true);
		good.setPrice(27.99);
		basket.getGoods().add(good);
		
		good = new Good();
		good.setName("bottle");
		good.setDesc("bottle of perfume");
		good.setType(Constants.GOOD_TYPE_OTHER);
		good.setImported(false);
		good.setPrice(18.99);
		basket.getGoods().add(good);

		good = new Good();
		good.setName("packet");
		good.setDesc("packet of headache pills");
		good.setType(Constants.GOOD_TYPE_MEDICAL);
		good.setImported(false);
		good.setPrice(9.75);
		basket.getGoods().add(good);

		good = new Good();
		good.setName("box");
		good.setDesc("box of chocolates");
		good.setType(Constants.GOOD_TYPE_FOOD);
		good.setImported(true);
		good.setPrice(11.25);
		basket.getGoods().add(good);
		
		boolean result = Main.calcTaxes(basket);
		assert(result);
	}
}
