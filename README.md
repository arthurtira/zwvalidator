# ZW Common Validator
A small library to validate common Zimbabwean identification numbers and mobile numbers

### Available validations

1. `CommonValidator.isValidId(String idNumber)` - Checks if identification number is valid
2. `CommonValidator.isValidPassportNumber(String passportNumber)` - Checks if passport number is valid. Example of a valid Zimbabwean passport number format is AA00000
3. `CommonValidator.isValidMobileNumber(String mobileNumber)` - Checks if number is a valid Zimbabwean mobile number that belongs to one of the 3 mobile network operators (Econet, Netone, Telecel)
4. `CommonValidator.isValidDriverLicence(String licenceNumber)` - Checks if licence number is a valid Zimbabwean driver licence in the format 00000AA
5. `CommonValidator.isValidNumberPlate(String numberPlate)` - Check if vehicle number plate is a valid Zimbabwean plate.