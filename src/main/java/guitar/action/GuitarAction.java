package guitar.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import guitar.dao.Inventory;
import guitar.entity.Guitar;

public class GuitarAction extends ActionSupport
{
	private String serialNumber,builder,model,type,backWood,topWood; 
	private double price;
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBuilder() {
		return builder;
	}
	public void setBuilder(String builder) {
		this.builder = builder;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBackWood() {
		return backWood;
	}
	public void setBackWood(String backWood) {
		this.backWood = backWood;
	}
	public String getTopWood() {
		return topWood;
	}
	public void setTopWood(String topWood) {
		this.topWood = topWood;
	}
	
	/**
	 * 
	 */
	public String search(){
    	Inventory inventory = new Inventory();
    	double price=(double)getPrice();
        Guitar whatErinLikes = new Guitar(getSerialNumber(), price, getBuilder(), getModel(), getType(), getBackWood(), getTopWood());
        Guitar guitar = inventory.search(whatErinLikes);
    	//System.out.println(guitar.getBuilder());
        ActionContext.getContext().put("guitar",guitar);
        return SUCCESS;   	
    	
    }
	
}
