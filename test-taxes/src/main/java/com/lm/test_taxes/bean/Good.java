package com.lm.test_taxes.bean;


public class Good {

	private String name;
	private String desc;
	private String type;
	private Boolean imported;
	private Double price;

	private Double grossPrice;
	private Double taxAppl;
	//qta non serve nel test specifico
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Boolean getImported() {
		return imported;
	}
	public void setImported(Boolean imported) {
		this.imported = imported;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getGrossPrice() {
		return grossPrice;
	}
	public void setGrossPrice(Double grossPrice) {
		this.grossPrice = grossPrice;
	}
	public Double getTaxAppl() {
		return taxAppl;
	}
	public void setTaxAppl(Double taxAppl) {
		this.taxAppl = taxAppl;
	}
	
}
