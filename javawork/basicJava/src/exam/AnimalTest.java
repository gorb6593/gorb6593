package exam;

public class AnimalTest {
	public static void main(String[] args) {
		Animal cat = new Cat(8);
		Animal pig = new Pig(3);
		for (int i =1; i <=3; i++) {
			cat.run(1);
			pig.run(1);
			System.out.println(i+"�ð���");
			System.out.println("������� �̵��Ÿ�="+cat.getDistance());
			System.out.println("������ �̵��Ÿ�="+pig.getDistance());
		}
	}
}
