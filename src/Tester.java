
public class Tester {
	public static void main(String[] args) {
		
		Vehicle[] vehArray = new Vehicle[3];
		
		Car myCar = new Car("BMW","1 Series",140,"N70 MWH","2008-05-01");
		vehArray[0] = myCar;
		Car parentsCar = new Car("Vauxhall","Astra",80, "HK07 GCV","2007-01-01");
		vehArray[1] = parentsCar;
		Lorry test = new Lorry("Big","Lorry",500,"BG16 HBG","2016-05-10",101.0);
		vehArray[2] = test;
		System.out.println(myCar.carInformation());
		System.out.println(parentsCar.carInformation());
		System.out.println(test.lorryInformation());
		
		for (int i = 0; i < vehArray.length; i++) {
			if(vehArray[i].getMake() == " ") {
				System.out.println("No Make Is Entered");
			}else {
			  System.out.println(vehArray[i].getMake());
			}
		}
	}

}
