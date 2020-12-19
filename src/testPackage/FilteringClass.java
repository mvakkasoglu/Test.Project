package testPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteringClass {
	
	public static void main(String[] args) {
		String string_argument = "hackerrank";
		System.out.print(vowel_filter(string_argument));
		
	}
	
	public static String vowel_filter(String str) {
		List<Character> list_of_char = new ArrayList<>();
		List<Character> list_of_vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
		for(Character character:str.toCharArray()) {
			list_of_char.add(character);
		}
		
		for(Character ch : str.toCharArray()) {
			if(list_of_vowels.contains(ch)) {
				list_of_char.remove(ch);
			    }
		}
		
		String filtered_string = "";
		for(Character c: list_of_char) {
			filtered_string += c;
		}	
		return filtered_string;	
	}
}
