package com.github.zwvalidator.util;

public interface RegexConstants {
    String ECONET_NUMBER_REGEX = "(((\\+)*263)|0)7(7|8)[0-9]{7}";
    String NETONE_NUMBER_REGEX = "(((\\+)*263)|0)71[0-9]{7}";
    String TELECEL_NUMBER_REGEX = "(((\\+)*263)|0)73[0-9]{7}";

    String PASSPORT_NUMBER_REGEX = "[a-zA-Z]{2}[0-9]{6}";
    String DRIVER_LICENCE_REGEX = "[0-9]{5}[a-zA-Z]{2}";
    String NUMBER_PLATE_REGEX = "[a-zA-Z]{3}(-| )*[0-9]{4}";
    String ID_NUMBER_REGEX = "[0-9]{2}(-| )*[0-9]{6,7}( )*[a-zA-Z]( )*[0-9]{2}";
}
