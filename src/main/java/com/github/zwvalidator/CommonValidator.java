package com.github.zwvalidator;

import com.github.zwvalidator.util.RegexConstants;

public class CommonValidator {
    public static boolean isValidId(String nationalId){
        if(nationalId == null || nationalId == "")
            return false;
        return nationalId.matches(RegexConstants.ID_NUMBER_REGEX);
    }

    public static boolean isValidPassportNumber(String passportNumber) {
        if(passportNumber == null || passportNumber == "")
            return false;
        return passportNumber.matches(RegexConstants.PASSPORT_NUMBER_REGEX);
    }

    public static boolean isValidMobileNumber(String phoneNumber) {
        if(phoneNumber == null || phoneNumber == "")
            return false;
        return phoneNumber.matches(RegexConstants.ECONET_NUMBER_REGEX) ||
                phoneNumber.matches(RegexConstants.NETONE_NUMBER_REGEX) ||
                phoneNumber.matches(RegexConstants.TELECEL_NUMBER_REGEX);
    }

    public static boolean isValidDriverLicence(String driverLicence) {
        if(driverLicence == null || driverLicence == "")
            return false;
        return driverLicence.matches(RegexConstants.DRIVER_LICENCE_REGEX);
    }

    public static boolean isValidNumberPlate(String numberPlate) {
        if(numberPlate == null || numberPlate == "")
            return false;
        return numberPlate.matches(RegexConstants.NUMBER_PLATE_REGEX);
    }

}
