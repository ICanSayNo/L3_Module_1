package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				System.out.println(i);
				return i;
			}
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		int pearls = 0;
		for (Boolean o : oysters) {
			if(o) {
				pearls++;
			}
		}
		System.out.println(pearls);
		return pearls;
	}
	
	//Add other methods here
	
}