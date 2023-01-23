package com.example.validadormvp;

import java.util.regex.Pattern;

public class ValidationModel {
    private int min;
    private int mediun;
    private int max;
    private String color;
    private String textColor;

    public String getTextColor() {

        return textColor;
    }

    public String validateSegurity(String value){
        if (value.length()<5){
            textColor="debil";
            return "#FF0000";
        }
        if (value.length()>5){
            if (value.equals(value.toLowerCase())){
                textColor="medio";
                return "#FFFF00";
            }else {
                textColor="fuerte";
                return "#FFFF00";
            }
        }
        else {
            return "";
        }
    }

//    public String validatepass(String password) {
//
//        // check for pattern
//        Pattern uppercase = Pattern.compile("[A-Z]");
//        Pattern lowercase = Pattern.compile("[a-z]");
//        Pattern digit = Pattern.compile("[0-9]");
//
//        // if lowercase character is not present
//        if (!lowercase.matcher(password).find()) {
//            atoz.setTextColor(Color.RED);
//        } else {
//            // if lowercase character is  present
//            atoz.setTextColor(Color.GREEN);
//        }
//
//        // if uppercase character is not present
//        if (!uppercase.matcher(password).find()) {
//            AtoZ.setTextColor(Color.RED);
//        } else {
//            // if uppercase character is  present
//            AtoZ.setTextColor(Color.GREEN);
//        }
//        // if digit is not present
//        if (!digit.matcher(password).find()) {
//            num.setTextColor(Color.RED);
//        } else {
//            // if digit is present
//            num.setTextColor(Color.GREEN);
//        }
//        // if password length is less than 8
//        if (password.length() < 8) {
//            charcount.setTextColor(Color.RED);
//        } else {
//            charcount.setTextColor(Color.GREEN);
//        }
//    }
}
























