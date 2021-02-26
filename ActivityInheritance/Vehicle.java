
public class Vehicle {
	private String make;
	private String vechicleNumber;
	private String fuelType;
	private int fuelCapacity;
	private int cc;
	public Vehicle(String make, String vechicleNumber, String fuelType, int fuelCapacity, int cc) {
		super();
		this.make = make;
		this.vechicleNumber = vechicleNumber;
		this.fuelType = fuelType;
		this.fuelCapacity = fuelCapacity;
		this.cc = cc;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVechicleNumber() {
		return vechicleNumber;
	}
	public void setVechicleNumber(String vechicleNumber) {
		this.vechicleNumber = vechicleNumber;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	public void displayMake()
	{
		System.out.println("Make of the vehicle" + getMake());
	}
	public void displayBasicInfo()
	{
		System.out.println("Vehicle Number" + getVechicleNumber());
		System.out.println("Fuel Type" + getFuelType());
		System.out.println("Fuel Capacity" + getFuelCapacity());
		System.out.println("CC Vehicle" + getCc());
		
	}
	public void  displayDetailedInfo()
	{
		
	}
}
