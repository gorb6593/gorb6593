package basic;

public class TimeTest{
	public static void main(String[] args){
		int time = 8000;
		int hour = time/3600;
		int min = (time-(hour*3600))/60;
		int sec = (time-(hour*3600))-(min*60);
	
		System.out.println(hour+"�ð�"+min+"��"+sec+"��");
}
}
