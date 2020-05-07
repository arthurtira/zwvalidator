# ZW Common Validator
A small library to validate common Zimbabwean identification numbers and mobile numbers

## How to use it 
 #### If you are using Maven for your project just put the following dependency in your pom.xml file: 
 
 `<dependency>
    <groupId>com.github.arthurtira</groupId>
    <artifactId>zwvalidator</artifactId>
    <version>1.0.0</version>
  </dependency>`
  
  All the validation methods are static methods, so you can import them as shown below:
  `import static com.github.zwvalidator.CommonValidator.isValidMobileNumber;`
  
### Available validations

1. `CommonValidator.isValidId(String idNumber)` - Checks if identification number is valid
2. `CommonValidator.isValidPassportNumber(String passportNumber)` - Checks if passport number is valid. Example of a valid Zimbabwean passport number format is AA00000
3. `CommonValidator.isValidMobileNumber(String mobileNumber)` - Checks if number is a valid Zimbabwean mobile number that belongs to one of the 3 mobile network operators (Econet, Netone, Telecel)
4. `CommonValidator.isValidDriverLicence(String licenceNumber)` - Checks if licence number is a valid Zimbabwean driver licence in the format 00000AA
5. `CommonValidator.isValidNumberPlate(String numberPlate)` - Check if vehicle number plate is a valid Zimbabwean plate.