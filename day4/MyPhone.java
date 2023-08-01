package week2.day4;

public class MyPhone implements Android {

	@Override
	public void watchVideo() {
      System.out.println("Let's watch a video.");
		
	}

	@Override
	public void openApp() {
		System.out.println("You open the app.");
		
	}

	public static void main(String []args) {
		
		Android a = new MyPhone();
	a.watchVideo();
	a.openApp();
		
		
		
	}
	
	
}
