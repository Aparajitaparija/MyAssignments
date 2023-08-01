package week2.day4;

public class Automation extends MultipleLanguage implements Language,Testtool {

	public static void main(String[] args) {
		 
		Automation auto = new Automation();
		auto.python();
		auto.ruby();
		auto.java();
		auto.selenium();	
}
    
	public void java() {
		System.out.println("java");
		
	}

	public void selenium() {
	  System.out.println("hello");
		
	}

	@Override
	public void ruby() {
		System.out.println("ruby");
		
	}

	@Override
	public void python() {
	System.out.println("python");
		
	}
}
