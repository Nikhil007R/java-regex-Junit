package com.bridgelabz.regex;

import java.util.Scanner;

public class ValidateUsername {
    public static boolean isValidUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{4,14}$");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a username ");
        String userName = sc.next();

        if(isValidUsername(userName)){
            System.out.println("Valid Username: ");
        }
        else{
            System.out.println("Invalid Username ");
        }

//        System.out.println(isValidUsername("user_123")); //  true
//        System.out.println(isValidUsername("123user"));  //  false
//        System.out.println(isValidUsername("us"));       //  false
//        System.out.println(isValidUsername("valid_name")); //  true
//        System.out.println(isValidUsername("User1234_")); //  true
    }
}


