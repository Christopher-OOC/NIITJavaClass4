package org.example.fx;

public class TestString {

    public static void main(String[] args) {

        String text = "Welcome to NIIT";

        System.out.println(text.toLowerCase());
        System.out.println(text.split("N")[0]);
        System.out.println(text.replace("Welcome", "Happy"));
        System.out.println(text.trim());
        System.out.println(text.isBlank());
        System.out.println(text.indexOf("n"));
        System.out.println(text.lastIndexOf("o"));
        System.out.println(text.startsWith("welcome"));
        System.out.println(text.charAt(11));
        System.out.println(text.startsWith("welcome"));
        System.out.println(text.concat(", We are happy to see you!"));
        //System.out.println(text.su);



//        int num = 100;
//        //num.
//
//        String numStr = num + "";
//        numStr = numStr + 'c';
//
//        System.out.println("Hello, " + text);

    }
}
