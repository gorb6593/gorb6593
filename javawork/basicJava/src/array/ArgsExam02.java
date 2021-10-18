package array;

public class ArgsExam02 {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			if(Integer.parseInt(args[i])%2==0) {
				System.out.println("명령행매개변수"+(i+1)+":"+args[i]+"->짝수");				
			}else {
				System.out.println("명령행매개변수"+(i+1)+":"+args[i]+"->홀수");
			}
		}

	}

}
