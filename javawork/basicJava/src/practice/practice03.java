package practice;
//p.181
public class practice03 {
	public static void main(String[] args) {		
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("mutiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
}

class MyMath {
	long add(long a, long b) {
		long result = a + b;
		return result;
	}
	long subtract(long a, long b) { return a - b;}
	long multiply(long a, long b) { return a * b;}
	double divide(double a, double b) { return a / b;
	}
}

//질문 1.  5번줄 new MyMath()의 ()의 의미

