package com.bridgelabz.regex;
import java.util.*;
import java.util.regex.*;

public class ExtractEmail {

    public static void ExtractEmail(String str){
        Pattern pattern = Pattern.compile("[A-Za-z]+@[a-zA-Z]+.[a-z]{2,}");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.println(matcher.group(0));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        ExtractEmail(str);

    }
}
