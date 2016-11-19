package com.lm.test_taxes.bean;

import java.util.ArrayList;

public class Receipt {

	private ArrayList<Good> goods = new ArrayList<Good>();
	private Double totTaxes;
	private Double total;

	public ArrayList<Good> getGoods() {
		return goods;
	}

	public void setGoods(ArrayList<Good> goods) {
		this.goods = goods;
	}

	public Double getTotTaxes() {
		return totTaxes;
	}

	public void setTotTaxes(Double totTaxes) {
		this.totTaxes = totTaxes;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}
	
	
}
