import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of players: ");
		int number = Integer.parseInt(br.readLine());
		Player[] playerArr = new Player[number];
		for (int i = 0; i < number; i++) {
			System.out.println("Enter player details " + (i+1));
			String s = br.readLine();
			playerArr[i] = Player.createPlayer(s);
		}
		HashMap<String, Integer> hMap = new HashMap<String, Integer>();
		String key = "";
		int value = 0;
		for (int i = 0; i < number; i++) {
			if (hMap.containsKey(playerArr[i].getNationality())) {
				hMap.put(playerArr[i].getNationality(), hMap.get(playerArr[i].getNationality()) + 1);
			} else {
				hMap.put(playerArr[i].getNationality(), 1);
			}
			Set<Map.Entry<String, Integer>> set = hMap.entrySet();
		
			for (Map.Entry<String, Integer> mapValue : set) {
				if (mapValue.getValue() > value) {
					value = mapValue.getValue();
					key = mapValue.getKey();
				}
			}
			
		}
		System.out.println("Maximum Player are from: " + key);
	}
}