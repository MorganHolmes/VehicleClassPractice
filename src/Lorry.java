
public class Lorry extends Vehicle {
	/*Variables*/
	private double weight;
	
	
	public Lorry(String m, String mo, int horse, String reg, String regDate, double weight) {
		super(m, mo, horse, reg,regDate);	
		this.weight = weight;
	}
	public Lorry(String m, String mo, String reg, double weight) {
		super(m,mo,reg);
		this.weight = weight;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String lorryInformation() {
		return "Make: " + getMake() + " Model: " + getModel() + " HorsePower: " + getHorsePower() + "BHP Registration: " + getReg() + " Registered Date: " + getRegDate() + " Weight: " + getWeight() + "KG";
	}

}
