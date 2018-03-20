package SearchingAndSortingAlgorithms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				
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
		
		return pearls;
	}
	public static double findTallest(List<Double> peeps) {
		double tallest=0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>=tallest) {
			
				tallest=peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String word="";
		String longestWord="";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>longestWord.length()) {
			
				longestWord=words.get(i);
				
			}
		}
		return longestWord;
	}
	
	public static boolean containsSOS(List<String> message) {
			if (message.contains(" ... --- ... ")) {
				
				return true;
			}
		
		return false;
	}
	
	public static List<Double> sortScores(List<Double> scores){
		List<Double>scoreList=new ArrayList<Double>();
		scoreList.add(scores.get(0));
		System.out.println(scores);
		for (int i = 0; i < scores.size(); i++) {
			
			for (int j = 0; j < scoreList.size(); j++) {
				if(scores.get(i)<scoreList.get(j)) {
					scoreList.add((j-1), scores.get(i));
				}
				
				else {
					scoreList.add(scores.get(i));
					
				}
			}
			
		}
		System.out.println(scoreList);
		return scoreList;
	}
	//Add other methods here
	
}