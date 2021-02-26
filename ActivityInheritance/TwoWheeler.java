
public class TwoWheeler extends Vehicle {
	
	private boolean kickStartAvailable;
	
	public boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public TwoWheeler(String make, String vechicleNumber, String fuelType, int fuelCapacity, int cc, boolean kickStartAvailable) {
		super(make, vechicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable=kickStartAvailable;
	}
	public void displayBasicInfo()
	{
		if(kickStartAvailable == true)
		{
			System.out.println("KickStartAvailble" + "Yes");
		}
		else
		{
			System.out.println("KickStartAvailble" + "no");
		}
			
		System.out.println("Vehicle Number" + getVechicleNumber());
		System.out.println("Fuel Type" + getFuelType());
		System.out.println("Fuel Capacity" + getFuelCapacity());
		System.out.println("KickStart" + getKickStartAvailable());
		System.out.println("CC Vehicle" + getCc());
		
	}
		
}
