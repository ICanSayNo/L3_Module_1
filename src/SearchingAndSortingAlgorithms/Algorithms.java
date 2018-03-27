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
		List<Double> sortedList = new ArrayList<Double>();
		sortedList.add(0, scores.get(0));
		for (int i = 1; i < scores.size(); i++){
			boolean foundSpot = false;
			for (int j = 0; j < sortedList.size(); j++) {
				if (scores.get(i)<sortedList.get(j)) {
					sortedList.add(j, scores.get(i));
					foundSpot = true;
					break;
				}
			}
			if (!foundSpot) {
				sortedList.add(scores.get(i));
			}
		}
		System.out.println(sortedList);
		return sortedList;
	}
	
	public static List<String> sortDNA(List<String> DNA){
		List<String> sortedList = new ArrayList<String>();
		sortedList.add(0, DNA.get(0));
		for (int i = 1; i < DNA.size(); i++){
			boolean foundSpot = false;
			for (int j = 0; j < sortedList.size(); j++) {
				if (DNA.get(i).length()<sortedList.get(j).length()) {
					sortedList.add(j, DNA.get(i));
					foundSpot = true;
					break;
				}
			}
			if (!foundSpot) {
				sortedList.add(DNA.get(i));
			}
		}
		System.out.println(sortedList);
		return sortedList;
	}
	
	public static List<String> sortWords(List<String> Words){
		List<String> sortedList = new ArrayList<String>();
		sortedList.add(0, Words.get(0));
		for (int i = 1; i < Words.size(); i++){
			boolean foundSpot = false;
			for (int j = 0; j < sortedList.size(); j++) {
				if (Words.get(i).compareTo(sortedList.get(j))<0) {
					sortedList.add(j, Words.get(i));
					foundSpot = true;
					break;
				}
			}
			if (!foundSpot) {
				sortedList.add(Words.get(i));
			}
		}
		System.out.println(sortedList);
		return sortedList;
	}
	//Add other methods here
	
}