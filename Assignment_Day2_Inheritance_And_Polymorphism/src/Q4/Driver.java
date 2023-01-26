/**
 * 
 */
package Q4;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		double i, j;
		
		if(!isNumeric(args[0])) {
			System.out.println("First argument needs to be numeric");
		} else if(!isNumeric(args[2])) {
			System.out.println("Third argument needs to be numeric");
		} else {
			i = Integer.parseInt(args[0]);
			j = Integer.parseInt(args[2]);
			switch(args[1]) {
			case "+":
				System.out.println(i + " + " + j + " = " + (i + j));
				break;
			case "-":
				System.out.println(i + " - " + j + " = " + (i - j));
				break;
			case "*":
				System.out.println(i + " * " + j + " = " + (i * j));
				break;
			case "/":
				if(j != 0) {
					System.out.println(i + " / " + j + " = " + (i / j));
				} else {
					System.out.println("Cannot be divided by Zero");
				}
				break;
			default:
				System.out.println("Not a valid operator");
				break;
			}
			
		}

	}
	
	// throw & catch exception is next chapter content, so I guess it should not 
	// be implemented at this point. I implemented a simple method
	// to check if command line arguments 0 and 2 are valid numbers
	private static boolean isNumeric(String s) {
		for(int i = 0; i < s.length(); i++) {
			if(Character.getNumericValue(s.charAt(i)) < 0 || 
					Character.getNumericValue(s.charAt(i)) > 9) {
				return false;
			}
		}
		return true;
	}

}
