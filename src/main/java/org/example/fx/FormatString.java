package org.example.fx;

public class FormatString {

    public static void main(String[] args) {
        String s = "Welcome";
        int i = 1000;
        double d = 6242.28765765678;
        
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);
        System.out.println();
        System.out.printf("%10s\n", s);
        System.out.printf("%-10s\n", s);
        System.out.println(i);
        System.out.printf("%10.5f", d);

    }
}
