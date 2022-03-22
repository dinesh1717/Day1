package javaBasics;

public class equalString {
    /**
     * An example java program to compare if two strings are equal
     */

        public static void main(String[] args) {
            // string declaration
            String str1 = "Hello World";
            String str2 = "Hello World";
            // str1.equals(str2) method returns true if str1 has same characters as that of str2
            boolean areTwoStringsEqual = str1.equals(str2);

            System.out.println("Are two strings equal : "+areTwoStringsEqual);
        }
    }
