package com.jfcSpringBoot.jbasics;
import java.util.*;
public class StringMethodsExample {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	String str = sc.nextLine();
    	
        // charAt()
        char charAtIndex5 = str.charAt(5);
        System.out.println("charAt(): Character at index 5: " + charAtIndex5);
        
        // compareTo()
        String str1 = "hello";
        String str2 = "Hello";
        int compareResult = str1.compareTo(str2);
        System.out.println("compareTo(): Result of comparing 'hello' and 'Hello': " + compareResult);
        
        // concat()
        String concatResult = str.concat(" How are you?");
        System.out.println("concat(): Concatenated string: " + concatResult);
        
        // contains()
        boolean containsResult = str.contains("World");
        System.out.println("contains(): Contains 'World': " + containsResult);

        // endsWith()
        boolean endsWithResult = str.endsWith("!");
        System.out.println("endsWith(): Ends with '!': " + endsWithResult);
        
        // equals()
        boolean equalsResult = str.equals("Hello, World!");
        System.out.println("equals(): Equals 'Hello, World!': " + equalsResult);

        // equalsIgnoreCase()
        boolean equalsIgnoreCaseResult = str.equalsIgnoreCase("hello, world!");
        System.out.println("equalsIgnoreCase(): EqualsIgnoreCase 'hello, world!': " + equalsIgnoreCaseResult);
        
        // format()
        String formattedString = String.format("This is a %s string with %d placeholders.", "formatted", 2);
        System.out.println("format(): Formatted string: " + formattedString);
       
        // getBytes()
        byte[] byteArray = str.getBytes();
        System.out.println("getBytes(): Byte array: " + byteArray);

        // getChars()
        char[] charArray = new char[str.length()];
        str.getChars(0, str.length(), charArray, 0);
        System.out.println("getChars(): Char array: " + new String(charArray));

        // indexOf()
        int indexOfComma = str.indexOf(",");
        System.out.println("indexOf(): Index of comma: " + indexOfComma);

        // intern()
        String internedString = str.intern();
        System.out.println("intern(): Interned string: " + internedString);

        // isEmpty()
        boolean isEmptyResult = str.isEmpty();
        System.out.println("isEmpty(): Is empty: " + isEmptyResult);

        // join()
        String[] words = {"Hello", "World", "Java"};
        String joinedString = String.join(", ", words);
        System.out.println("join(): Joined string: " + joinedString);

        // lastIndexOf()
        int lastIndexOfSpace = str.lastIndexOf(" ");
        System.out.println("lastIndexOf(): Last index of space: " + lastIndexOfSpace);

        // length()
        int length = str.length();
        System.out.println("length(): Length of string: " + length);

        // replace()
        String replacedString = str.replace("o", "X");
        System.out.println("replace(): Replaced string: " + replacedString);

        // replaceAll()
        String replacedAllString = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("replaceAll(): Replaced all vowels with '*': " + replacedAllString);

        // split()
        String[] splitArray = str.split(", ");
        System.out.println("split(): Split string: ");
        for (String s : splitArray) {
            System.out.println(s);
        }

        // startsWith()
        boolean startsWithResult = str.startsWith("Hello");
        System.out.println("startsWith(): Starts with 'Hello': " + startsWithResult);

        // substring()
        String substring = str.substring(7);
        System.out.println("substring(): Substring from index 7: " + substring);

        // toCharArray()
        char[] charArray2 = str.toCharArray();
        System.out.println("toCharArray(): Char array: " + new String(charArray2));

        // toLowerCase()
        String lowercaseString = str.toLowerCase();
        System.out.println("toLowerCase(): Lowercase string: " + lowercaseString);
        
        // toUpperCase()
        String uppercaseString = str.toUpperCase();
        System.out.println("toUpperCase(): Uppercase string: " + uppercaseString);

        // trim()
        String strWithWhitespace = "  Trim me!  ";
        String trimmedString = strWithWhitespace.trim();
        System.out.println("trim(): Trimmed string: " + trimmedString);

        // valueOf()
        String valueOfString = String.valueOf(123);
        System.out.println("valueOf(): Value of integer 123: " + valueOfString);
        
    }
}

