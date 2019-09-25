public class Car extends Vehicle {
	public Car(String m, String mo, int horse, String reg, String regDate){
		/*Uses the constructor in the vehicle class*/
		super(m, mo, horse, reg,regDate);	
	}
	
	public String carInformation() {
		return "Make: " + getMake() + " Model: " + getModel() + " HorsePower: " + getHorsePower() + "BHP Registration: " + getReg() + " Registered Date: " + getRegDate();
		
	}
		
	
}
