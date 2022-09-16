package com.spsmb.project;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        run();
    }

    static void run() {
        intro();

    }

    static void intro() {
        System.out.println("this program analyzes your name \nThen it returns of vowels and consonant");
        userNameAnalysis(getName());
    }

    static void userNameAnalysis(String userName) {
        System.out.println("your entered name is ");
        int userNameLength = userName.length();
        int userNameVowelsCount = gerVowels(userName);
        int userNameConsonant = getConsonants(userName, userNameVowelsCount);
        System.out.println("The length of your name is: " +userNameLength);
        System.out.println("The number of vowels in your name is:" + userNameVowelsCount);
        System.out.println("The number of vowels in your name is: " + userNameConsonant);
    }

    static String getName() {
        System.out.println("Enter your name: ");
        String userName = sc.nextLine();
        return userName.toLowerCase(Locale.ROOT);
    }
    static int gerVowels(String userName){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y'};
        int vowelsCount = 0;
        for (int i = 0; i < userName.length(); i++) {
            for (char vowel: vowels) {
                if (userName.charAt(i) == vowel) vowelsCount++;
            }
        }
        return vowelsCount;

    }

    static int getConsonants(String userName, int vowelsCount){
      return userName.length() - vowelsCount;
        }


    }



