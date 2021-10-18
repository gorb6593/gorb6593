package exception;

public class CellPhone {
	String model;
	double battery;
	public CellPhone(String model) {
		super();
		this.model = model;
	}
	public void call(int time) throws IllegalArgumentException{
		if(time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		battery = battery - (time*0.5);
		if(battery<0) {
			battery = 0;
		}
		System.out.println("통화시간 : "+time+"분");
	}
	public void charge(int time) {
		if(time < 0) {
			throw new IllegalArgumentException("충전시간입력오류");
		}
		battery = battery + (time*3);
		if(battery>100) {
			battery = 100;
		}
		System.out.println("충전시간 : "+time+"분");
	}
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone) {
			CellPhone obj = (CellPhone)otherObject;
			if(this.model.equals(obj.model)) {
				return true;
			}
		}
		return false;
	}
}
