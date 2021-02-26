
public class FourWheeler extends Vehicle{
	
//	private static boolean kickStartAvailable;
	private String audioSystem;
	private int numberofDoors;

	public FourWheeler(String make, String vechicleNumber, String fuelType, int fuelCapacity, int cc, String audioSystem, int numberOfDoors) {
		super(audioSystem, audioSystem, audioSystem, numberOfDoors, numberOfDoors);
		// TODO Auto-generated constructor stub
		this.audioSystem = audioSystem;
		this.numberofDoors = numberOfDoors;
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberofDoors() {
		return numberofDoors;
	}
	public void setNumberofDoors(int numberofDoors) {
		this.numberofDoors = numberofDoors;
	}
	
	public void displayBasicInfo()
	{			
		System.out.println("Vehicle Number" + getVechicleNumber());
		System.out.println("Fuel Type" + getFuelType());
		System.out.println("Fuel Capacity" + getFuelCapacity());
		System.out.println("Vehicle CC" + getCc());
		System.out.println("Audio System" + getAudioSystem());
		System.out.println("Number of Doors" + getNumberofDoors());
		
	}
	
	
}
