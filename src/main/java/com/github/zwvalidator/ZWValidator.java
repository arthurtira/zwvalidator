package com.github.zwvalidator;

public class ZWValidator {
    public static boolean isValidId(String nationalId){
        if(nationalId == null || nationalId == "")
            return false;
        return nationalId.matches("[0-9]{2}(-| )*[0-9]{6,7}( )*[a-zA-Z]( )*[0-9]{2}");
    }

    public static boolean isValidPassportNumber(String passportNumber) {
        if(passportNumber == null || passportNumber == "")
            return false;
        return passportNumber.matches("[a-zA-Z]{2}[0-9]{6}");
    }

    public static boolean isValidMobileNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber == "")
            return false;
        return phoneNumber.matches("(((\\+)*263)|0)7(7|8)[0-9]{7}") ||
                phoneNumber.matches("(((\\+)*263)|0)71[0-9]{7}") ||
                phoneNumber.matches("(((\\+)*263)|0)73[0-9]{7}");
    }

    public static boolean isValidDriverLicence(String driverLicence) {
        if(driverLicence == null || driverLicence == "")
            return false;
        return driverLicence.matches("[0-9]{5}[a-zA-Z]{2}");
    }

    public static boolean isValidNumberPlate(String numberPlate) {
        if(numberPlate == null || numberPlate == "")
            return false;
        return numberPlate.matches("[a-zA-Z]{3}(-| )*[0-9]{4}");
    }

}
