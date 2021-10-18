package oop.inheritance;

public class Coffee extends Beverage{
	private String name;
	public Coffee() {
		
	}
	public Coffee(String type,int price,String name) {
		setType(type);
		setPrice(price);
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void print() {
		System.out.println("타입:"+getType()+",이름:"+name+",가격"+getPrice());
	}	
}
 