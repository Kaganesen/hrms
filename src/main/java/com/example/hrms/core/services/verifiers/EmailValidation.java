package com.example.hrms.core.services.verifiers;

import java.util.regex.Pattern;

public class EmailValidation {

    public static boolean isRealUser (String email){
        String EMAILPATTERN = "^[A-Z0-9.%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
        Pattern  pattern = Pattern.compile(EMAILPATTERN,Pattern.CASE_INSENSITIVE);
        return pattern.matcher(email).find();
    }
}
