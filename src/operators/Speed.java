package operators;

public class Speed {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long result = toMilesPerHour(1.5);
		printConversion(result);
		
		result = toMilesPerHour(10.25);
		printConversion(result);
		
		result = toMilesPerHour(-5.6);
		printConversion(result);
		
		result = toMilesPerHour(25.42);
		printConversion(result);
		
		result = toMilesPerHour(75.144);
		printConversion(result);
		
	}
	public static long toMilesPerHour(double kilometersPerHour) {
		if(kilometersPerHour < 0) {
			return -1;
		}
		else {
			double milesH = 1.609344;
			long result = Math.round(kilometersPerHour / milesH);
			return result;
		}
	}
	public static void printConversion(double kilometersPerHour) {
		double result1 = Math.round(kilometersPerHour * 1.609);
		
		
		if(kilometersPerHour < 0) {
			System.out.println("Invalid Value");
		}
		else {
			System.out.println(result1 + " km/h = " +
				    (int) kilometersPerHour + " mi/h");
		}
	}
}
