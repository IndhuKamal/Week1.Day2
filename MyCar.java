package week1.day2;

public class MyCar {
	public static void main(String[] args) {
		Car car=new Car();
		car.applyBreak();
		boolean accelerate = car.applyAccelerate();
		System.out.println(accelerate);
		boolean onAc = car.switchOnAc();
		System.out.println(onAc);
		}

}
