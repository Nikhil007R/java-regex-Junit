package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDates {

    public static void Dates(String str){
        Pattern pattern = Pattern.compile("\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/[0-9]{4}\\b");
        Matcher matcher = pattern.matcher(str);

        while(matcher.find()){
            System.out.print(matcher.group(0) + ", ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Dates(str);
    }
}

