package week1.day2;

public class Car {
	public void applyBreak() {
		System.out.println("Break Applied");
	}
	private boolean applyGear() {
		boolean isGeared=true;
		return(isGeared);
	}
    public boolean switchOnAc() {
    	boolean isAcOn= true;
    	return(isAcOn);
    }
    public boolean applyAccelerate() {
    	boolean isAccelerate=true;
    	return(isAccelerate);
    	
    }
    public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		boolean applyGear = obj.applyGear();
		System.out.println(applyGear);
		boolean onAc = obj.switchOnAc();
		System.out.println(onAc);
		boolean accelerate = obj.applyAccelerate();
		System.out.println(accelerate);
	}
}
