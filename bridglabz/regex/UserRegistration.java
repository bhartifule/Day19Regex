package com.bridglabz.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	 public  void validFirstName() {
         Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Bharti");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
public static void main(String[] args) {
	System.out.println("Welcome To Regular Expression");
	UserRegistration regex = new UserRegistration();
     regex.validFirstName();
     
 }
}

