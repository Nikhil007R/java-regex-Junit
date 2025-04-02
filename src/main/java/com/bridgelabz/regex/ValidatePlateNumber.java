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

        String regex = "^[A-Z]{2}[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if(isValid(str)){
            System.out.println("Valid Plate Number: ");
        }
        else{
            System.out.println("Invalid Plate Number: ");
        }

    }
}
