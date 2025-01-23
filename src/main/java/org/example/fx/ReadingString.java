package org.example.fx;

import java.util.Scanner;

public class ReadingString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some strings: ");
        String s1 = scanner.nextLine();
        String s2 = scanner.next();
        String s3 = scanner.next();

        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        System.out.println("S3 = " + s3);

    }

}
