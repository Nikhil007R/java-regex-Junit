package com.bridgelabz.regex;

import java.util.Scanner;
import java.util.regex.*;

public class ValidatePlateNumber {

    private static final Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$");
    static boolean isValid(String str){
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if(isValid(str)){
            System.out.println("Valid Plate Number: ");
        }
        else{
            System.out.println("Invalid Plate Number: ");
        }

    }
}
