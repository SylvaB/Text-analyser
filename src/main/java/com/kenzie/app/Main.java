package com.kenzie.app;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //method that counts the number of characters in a string
    public static int countCharacter(String inputString, String letter) {
        int count = 0;
        char[] letterArray = inputString.toCharArray();
        //convert lowercase and uppercase letter
        char lowerCaseChar = letter.toUpperCase().charAt(0);
        char upperCaseChar = letter.toLowerCase().charAt(0);

        for (char c : letterArray) {
            //match lower and upper case
            if (c == upperCaseChar || c == lowerCaseChar) {
                count++;
            }
        }
        return count;
    }

    //method that counts all characters
    public static int countAllChars(String inputString) {

        return inputString.length();

    }

    //method that counts the number of words in a string
    public static int countWords(String inputString) {



        String[] wordArray = inputString.split("[.,!? ]+");
        if (inputString.isEmpty()) {

            return 0;
        }

        return wordArray.length;
    }


    //method that finds the longest word in a string
    public static String findLongestWord(String inputString) {

        String[] wordArray = inputString.trim().replaceAll("[.,!?]", "").split("\\s+");
        String longestWord = "";

        for (String s : wordArray) {
            //check length of word at current index against the longest word
            if (s.length() > longestWord.length()) {
                //replace the longestWord value with the new longer word
                longestWord = s;
            }
        }
        return longestWord;
    }

    //method that finds the shortest word in a string
    public static String findShortestWord(String inputString) {

        //Fill out a method for finding the shortest word
        String[] wordArray = inputString.trim().replaceAll("[.,!?]", "").split("\\s+");
        String shortestWord = wordArray[0];

        for (String s : wordArray) {
            // System.out.println(shortestWord);
            //check length of word at current index against the longest word
            if (s.length() < shortestWord.length()) {
                //replace the shortestWord value with the new shorter word
                shortestWord = s;

            }
        }
        return shortestWord;
    }


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String inputString = userInput.nextLine();

        //String inputString = "Hello! Welcome to Kenzie.  My name is Robert, and I'm here with my friend Waldo.  Have you met waldo?";

        //variables
        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        int countPeriods = 0;
        int countCommas = 0;
        int countExclamationPoint = 0;
        int countQuestionMarks = 0;

        int countAllChars = 0;
        int numOfWords = 0;
        String longestWord = "";
        String shortestWord = "";


        //called methods
        countA = countCharacter(inputString, "a");
        countE = countCharacter(inputString, "e");
        countI = countCharacter(inputString, "i");
        countO = countCharacter(inputString, "o");
        countU = countCharacter(inputString, "u");

        countPeriods = countCharacter(inputString, ".");
        countCommas = countCharacter(inputString, ",");
        countExclamationPoint = countCharacter(inputString, "!");
        countQuestionMarks = countCharacter(inputString, "?");

        countAllChars = countAllChars(inputString);
        numOfWords = countWords(inputString);
        longestWord = findLongestWord(inputString);
        shortestWord = findShortestWord(inputString);


        System.out.println("****Text Analyzer Program***");

        System.out.println("Total [a]: " + countA);
        System.out.println("Total [e]: " + countE);
        System.out.println("Total [i]: " + countI);
        System.out.println("Total [o]: " + countO);
        System.out.println("Total [u]: " + countU);

        System.out.println("Total periods: " + countPeriods);
        System.out.println("Total commas: " + countCommas);
        System.out.println("Total exclamation points: " + countExclamationPoint);
        System.out.println("Total question marks: " + countQuestionMarks);

        System.out.println("Total characters: " + countAllChars);
        System.out.println("Total words: " + numOfWords);
        System.out.println("The longest word: " + longestWord);
        System.out.println("The shortest word: " + shortestWord);
    }
}
