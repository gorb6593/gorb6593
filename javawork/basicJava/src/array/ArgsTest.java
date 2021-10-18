package array;

public class ArgsTest {
	public static void main(String[] args) {
		System.out.println("명령행매개변수의 갯수:"+args.length);
		System.out.println("사용자ip:"+args[0]);
		System.out.println("사용자port:"+args[1]);
		
		//명령행매개변수
		System.out.println(Integer.parseInt(args[2])
				+Integer.parseInt(args[3]));
	}
}
