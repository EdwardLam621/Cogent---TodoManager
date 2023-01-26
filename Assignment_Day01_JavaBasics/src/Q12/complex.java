/**
 * 
 */
package Q12;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class complex {
	private float a;
	private float b;
	
	complex(){
		a = 1;
		b = 1;
	}
	
	complex(float a, float b){
		this.a = a;
		this.b = b;
	}
	
	
	/**
	 * @return the a
	 */
	public float getA() {
		return a;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(float a) {
		this.a = a;
	}

	/**
	 * @return the b
	 */
	public float getB() {
		return b;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(float b) {
		this.b = b;
	}

	
	
	
	public complex addition(complex x) {
		System.out.println(("Sum of " + "a" + this.a + " + " + "b" + this.b + "i"
				+ " & a" + x.a + " + " + "b" + x.b + "i is: "
				+ "a" + (this.a + x.a) + " + b" + (this.b + x.b) + "i"));
		return new complex(this.a + x.a, this.b + x.b);
	}
	
	public complex subtraction(complex x) {
		System.out.println(("Substraction of " + "a" + this.a + " + " + "b" + this.b + "i"
				+ " & a" + x.a + " + " + "b" + x.b + "i is: "
				+  "a" + (this.a - x.a) + " + b" + (this.b - x.b) + "i"));
		return new complex(this.a - x.a, this.b - x.b);
	}
	
	public String toString() {
		return "a" + a + " + " + "b" + b + "i";
		
	}
}

