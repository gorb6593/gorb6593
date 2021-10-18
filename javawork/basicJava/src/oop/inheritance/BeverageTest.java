package oop.inheritance;

public class BeverageTest {
	public static void main(String[] args) {
        Coffee coffee1 = new Coffee("커피",2500,"아메리카노");
        Coffee coffee2 = new Coffee("커피",2700,"카페라떼");
        Coffee coffee3 = new Coffee("커피",3000,"카푸치노");
        
        Coffee tea1 = new Coffee("차",2500,"쟈스민차");
        Coffee tea2 = new Coffee("차",2700,"인삼차");
        Coffee tea3 = new Coffee("차",3000,"쌍화차");
        coffee1.print();
        coffee2.print();
        coffee3.print();
        tea1.print();
        tea2.print();
        tea3.print();
        
        
	}

}
