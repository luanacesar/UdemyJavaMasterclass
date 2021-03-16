package operators;

public class Challenges {

	public static void main(String[] args) {
		
	double firstVar = 20.00d;
	double secondVar = 80.00d;
	double total = (firstVar + secondVar) * 100;
	System.out.println("my value total " + total);
	total = total % 40;
	
	boolean isTotal;
	
	System.out.println(total);
	
	
	if(total == 0) {
		isTotal = true;
		System.out.println(isTotal);
		
	}else {
		isTotal = false;
		System.out.println(isTotal);
		System.out.println("Got some remainder");
	}



	}

}
