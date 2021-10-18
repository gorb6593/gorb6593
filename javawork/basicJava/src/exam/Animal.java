package exam;

public class Animal {			
		int speed;
		double distance;
		int hour;
		public void Animal(int speed, double distance, int hour) {
			this.speed = speed;
			this.distance = distance;
			this.hour = hour;
		}
		public void speed() {
			
		}		
		public double getDistance() {
			distance = speed * hour;
			return distance;
		}
		public void run(int hour) {
			
		}
		
	
}

