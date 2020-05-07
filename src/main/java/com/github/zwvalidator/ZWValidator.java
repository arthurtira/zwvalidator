package com.github.zwvalidator;

public class ZWValidator {
    public static boolean isValidId(String nationalId){
        return nationalId.matches("[0-9]{2}(-| )*[0-9]{6,7}( )*[a-zA-Z]( )*[0-9]{2}");
    }

    public static boolean isValidPassportNumber(String passportNumber) {
        return passportNumber.matches("[a-zA-Z]{2}[0-9]{6}");
    }

    public static boolean isValidMobileNumber(String phoneNumber) {
        return phoneNumber.matches("(((\\+)*263)|0)7(7|8)[0-9]{7}") ||
                phoneNumber.matches("(((\\+)*263)|0)71[0-9]{7}") ||
                phoneNumber.matches("(((\\+)*263)|0)73[0-9]{7}");
    }

    public static boolean isValidDriverLicence(String driverLicence) {
        return driverLicence.matches("[0-9]{5}[a-zA-Z]{2}");
    }

    public static boolean isValidNumberPlate(String numberPlate) {
        return numberPlate.matches("[a-zA-Z]{3}(-| )*[0-9]{4}");
    }



}
