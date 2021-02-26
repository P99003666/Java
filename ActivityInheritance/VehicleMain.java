import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VehicleMain {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Two Wheeler");
			System.out.println("Four Wheeler");
			int num = Integer.parseInt(br.readLine());
			if(num==1)
			{
				System.out.println("Vehicle Make");
				String make = br.readLine();
				System.out.println("Vehicle Number");
				String number = br.readLine();
				System.out.println("Fuel Type");
				System.out.println("1.Petrol");
				System.out.println("2.Diesel");
				int t = Integer.parseInt(br.readLine());
				String fuel = "";
				if(t==1)
				{
					fuel = "Petrol";
				}
				else if(t==2)
				{
					fuel = "Diesel";
				}
				else 
				{
					fuel = "";
				}
				System.out.println("Fuel capacity");
				int cap = Integer.parseInt(br.readLine());
				System.out.println("CC");
				int cc = Integer.parseInt(br.readLine());
				System.out.println("Is KickStart Available");
				String ks = br.readLine();
				boolean ksVal = true;
				if(ks.equalsIgnoreCase("Yes"))
				{
					ksVal = true;
				}
				else
				{
					ksVal = false;
				}
				TwoWheeler tw = new TwoWheeler (make, fuel, number, cap, cc, ksVal);
				tw.displayMake();
				tw.displayBasicInfo();
				tw.displayDetailedInfo();
			}
			else if(num == 2)
			{
				System.out.println("Vehicle Make");
				String make = br.readLine();
				System.out.println("Vehicle Number");
				String number = br.readLine();
				System.out.println("Fuel Type");
				System.out.println("1.Petrol");
				System.out.println("2.Diesel");
				int t = Integer.parseInt(br.readLine());
				String fuel = "";
				if(t==1)
				{
					fuel = "Petrol";
				}
				else if(t==2)
				{
					fuel = "Diesel";
				}
				else 
				{
					fuel = "";
				}
				System.out.println("Fuel capacity");
				int cap = Integer.parseInt(br.readLine());
				System.out.println("CC");
				int cc = Integer.parseInt(br.readLine());
				System.out.println("Audio System");
				String audioSystem = br.readLine();
				System.out.println("Number of doors");
				int doorNums = Integer.parseInt(br.readLine());
				FourWheeler fw = new FourWheeler(make, number, fuel, cap, cc, audioSystem, doorNums);
				fw.displayMake();
				fw.displayBasicInfo();
				fw.displayDetailedInfo();
			}
			
			else
			{
				System.out.println("Invalid Input");
			}
				
	}
}
