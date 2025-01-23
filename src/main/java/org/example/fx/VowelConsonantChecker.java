package org.example.fx;

import java.util.Scanner;

public class VowelConsonantChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String vowels = "AEIOUaeiou";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZbcdfghjklmnpqrstvwxyz";

        System.out.print("Enter a letter: ");
        String input = scanner.next();

        if (vowels.contains(input)) {
            System.out.println(input + " is a vowel!");
        }
        else if (consonants.contains(input)) {
            System.out.println(input + " is a consonant!");
        }
        else {
            System.out.println(input + " is an invalid input!");
        }
    }
}
