package Assignments;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AssignmentString {

	//1. WAP to reverse a String.
	 class ReverseString {

	    public static void main(String[] args) {
	        String input = "iNeuron";
	        String output = reverseString(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        sb.reverse();
	        return sb.toString();
	    }
	}
	///2. WAP to reverse a sentence while preserving the position.
	 class ReverseSentence {

	    public static void main(String[] args) {
	        String input = "Think Twice";
	        String output = reverseSentence(input);
	        System.out.println("Input: " + input);
	        System.out.println("Output: " + output);
	    }

	    public static String reverseSentence(String sentence) {
	        String[] words = sentence.split(" ");
	        StringBuilder reversedSentence = new StringBuilder();
	        for (String word : words) {
	            StringBuilder reversedWord = new StringBuilder(word);
	            reversedWord.reverse();
	            reversedSentence.append(reversedWord).append(" ");
	        }
	        return reversedSentence.toString().trim();
	    }
	}
	//3. WAP to check if the String is Anagram or not.


	 class AnagramCheck {

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        boolean isAnagram = checkAnagram(str1, str2);
	        System.out.println(str1 + " and " + str2 + " are anagrams: " + isAnagram);
	    }

	    public static boolean checkAnagram(String str1, String str2) {
	        if (str1.length() != str2.length()) {
	            return false;
	        }
	        char[] charArray1 = str1.toLowerCase().toCharArray();
	        char[] charArray2 = str2.toLowerCase().toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        return Arrays.equals(charArray1, charArray2);
	    }
	}
	//4. WAP to check if the String is a Pangram or not.
	 class PangramCheck {

	    public static void main(String[] args) {
	        String str = "The quick brown fox jumps over the lazy dog";
	        boolean isPangram = checkPangram(str);
	        System.out.println(str + " is a pangram: " + isPangram);
	    }

	    public static boolean checkPangram(String str) {
	        boolean[] alphabet = new boolean[26];
	        str = str.toLowerCase();
	        for (int i = 0; i < str.length(); i++) {
	            char c = str.charAt(i);
	            if ('a' <= c && c <= 'z') {
	                alphabet[c - 'a'] = true;
	            }
	        }
	        for (boolean letter : alphabet) {
	            if (!letter) {
	                return false;
	            }
	        }
	        return true;
	    }
	}
	//5. WAP to print repeatedly occurring characters in the given String.
	
	 class RepeatedCharacters {

	    public static void main(String[] args) {
	        String str = "programming";
	        printRepeatedCharacters(str);
	    }

	    public static void printRepeatedCharacters(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        for (char c : str.toCharArray()) {
	            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	        }
	        Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
	        System.out.println("Repeated characters in " + str + ":");
	        for (Map.Entry<Character, Integer> entry : entrySet) {
	            if (entry.getValue() > 1) {
	                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
	            }
	        }
	    }
	}
	//6. WAP to sort a String Alphabetically.
	 class SortStringAlphabetically {

	    public static void main(String[] args) {
	        String str = "hello";
	        String sortedString = sortStringAlphabetically(str);
	        System.out.println("Original String: " + str);
	        System.out.println("Sorted String: " + sortedString);
	    }

	    public static String sortStringAlphabetically(String str) {
	        char[] charArray = str.toCharArray();
	        Arrays.sort(charArray);
	        return new String(charArray);
	    }
	}
	//7. WAP to count the number of Vowels and Consonants of a String value.
	 class VowelConsonantCount {

	    public static void main(String[] args) {
	        String str = "iNeuron";
	        countVowelsAndConsonants(str);
	    }

	    public static void countVowelsAndConsonants(String str) {
	        int vowelCount = 0;
	        int consonantCount = 0;
	        str = str.toLowerCase();
	        for (char c : str.toCharArray()) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                vowelCount++;
	            } else if (c >= 'a' && c <= 'z') {
	                consonantCount++;
	            }
	        }
	        System.out.println("String: " + str);
	        System.out.println("Vowels: " + vowelCount);
	        System.out.println("Consonants: " + consonantCount);
	    }
	}
	//8. WAP to count the number of special characters.
	 class SpecialCharacterCount {

	    public static void main(String[] args) {
	        String str = "Hello!@#$%^&*()";
	        int count = countSpecialCharacters(str);
	        System.out.println("String: " + str);
	        System.out.println("Special Characters: " + count);
	    }

	    public static int countSpecialCharacters(String str) {
	        int count = 0;
	        for (char c : str.toCharArray()) {
	            if (!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)) {
	                count++;
	            }
	        }
	        return count;
	    }
	}

}
