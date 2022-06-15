package week1.day2;

public class TwoWheeler {
	public void noOfWheels() {
		System.out.println("There are two wheels");
		
	}
	public short noOfMirrors=2;
	public long chassisNumber=5688940949909l;
	public boolean isPunctured =true;
	public String bikeName ="Apache";
	double runningKM = 90.89989;
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
        obj.noOfWheels();
		short noOfMirrors=2;
		System.out.println("There are " +noOfMirrors + " mirrors");
		long chassisNumber=5688940949909l;
		System.out.println(chassisNumber);
		boolean isPunctured=true;
		System.out.println(isPunctured);
		String bikeName="Apache";
		System.out.println(bikeName);
		double runningKM=90.89989;
		System.out.println(runningKM);
	}
	

}
