
public class Vehicle {
	/*Class variables*/
	private String make;
	private String model;
	private int horsePower;
	private String registration;
	private String registeredDate;
	/*                   */
	
	/*Constructors*/
	public Vehicle(String make, String model, int horsePower, String registration,String registeredDate){
		this.make = make;
		this.model = model;
		this.horsePower = horsePower;
		this.registration = registration;
		this.registeredDate = registeredDate;
	}
	
	public Vehicle(String make, String model, String reg) {
		this.make = make;
		this.model = model;
		registration = reg;
	}
	
	public Vehicle() {
		make = "None";
		model = "None";
		horsePower = 0;
		registration = "None";
	}
	/*                        */
	
	/*Get methods*/
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getHorsePower() {
		return horsePower;
	}
	public String getReg() {
		return registration;
	}
	public String getRegDate() {
		return registeredDate;
	}
	/*              */
	
	/*Set Methods */
	public void setReg(String newReg) {
		registration = newReg;		
	}
	
	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}
	/*                      */
}
