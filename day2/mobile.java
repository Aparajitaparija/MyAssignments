package week1.day2;

public class mobile {
	
	public void sendSms() {
		System.out.println("From oppo");
	}
	public long makeCall(long phno) {
		return phno;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mobile samsung= new mobile();
		samsung.sendSms();
		samsung.makeCall(564888);
		
	}

}
