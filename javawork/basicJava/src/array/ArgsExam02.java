package array;

public class ArgsExam02 {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++) {
			if(Integer.parseInt(args[i])%2==0) {
				System.out.println("�����Ű�����"+(i+1)+":"+args[i]+"->¦��");				
			}else {
				System.out.println("�����Ű�����"+(i+1)+":"+args[i]+"->Ȧ��");
			}
		}

	}

}
