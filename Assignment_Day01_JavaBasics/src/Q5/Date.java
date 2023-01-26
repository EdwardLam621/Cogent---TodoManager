/**
 * 
 */
package Q5;

/**
 * @author : Edward Lam
 * @date   : 2023-01-18
 */
public class Date {
	int dd,mm,yyyy;

	
	
	/**
	 * 
	 */
	public Date() {
		super();
		this.dd = 17;
		this.mm = 1;
		this.yyyy = 2023;
	}



	/**
	 * @param dd
	 * @param mm
	 * @param yyyy
	 */
	public Date(int dd, int mm, int yyyy) {
		super();
		
		if(checkDate(dd,mm,yyyy)) {
			this.dd = dd;
			this.mm = mm;
			this.yyyy = yyyy;
		}
		
	}
	
	

	/**
	 * @return the dd
	 */
	public int getDd() {
		return dd;
	}

	/**
	 * @param dd the dd to set
	 */
	public void setDd(int dd) {
		this.dd = dd;
	}

	/**
	 * @return the mm
	 */
	public int getMm() {
		return mm;
	}

	/**
	 * @param mm the mm to set
	 */
	public void setMm(int mm) {
		this.mm = mm;
	}

	/**
	 * @return the yyyy
	 */
	public int getYyyy() {
		return yyyy;
	}

	/**
	 * @param yyyy the yyyy to set
	 */
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}
	
	
	private boolean checkDate(int dd, int mm, int yyyy) {
		switch(mm) {
		case 1,3,5,7,8,10,12:
			if(dd >= 1 && dd <= 31) {
				if(yyyy >= 1900 && yyyy < 2023) {
					return true;
				} else {
					System.out.println("Invalid date");
					return false;
				}	
			}
		case 4,6,9,11:
			if(dd >= 1 && dd <= 30) {
				if(yyyy >= 1900 && yyyy < 2023) {
					return true;
				} else {
					System.out.println("Invalid date");
					return false;
				}	
			}
		case 2:
			if(dd >= 1 && dd <= 29) {
				if(yyyy >= 1900 && yyyy < 2023) {
					return true;
				} else {
					System.out.println("Invalid date");
					return false;
				}	
			}
		}
		System.out.println("Invalid date");
		return false;
	}
	
	public String toString() {
		return mm + "/" + dd + "/" + yyyy;
	}
}
