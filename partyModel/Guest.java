package partyModel;

public class Guest {
    /* Declare instance variables for first name, last name as String-objects, 
       and age as an int and address as an Address-object.
     */
    private String firstName;
    private String lastName;
    private int age;
    private Address address;


    /* Write a default constructor (no parameters) that gives default values for
       instance variables and creates the Address-object using
       the default constructor for class Address.
       Use default values for first name, last name and age of your choice
       that will inform a user that this value isn't really set 
       and that will work for calculating statistics.

       You can handle this in this constructor or call
       the constructor below with null for all values and handle that there.
     */

    public Guest (){
        this.firstName = "Default first name";
        this.lastName = "Default last name";
        this.age = 0;
        this.address = new Address();
    }


    /* Write a constructor with parameters for all instance variables
       given above where the address is a reference to an Address-object
       and first name and last name are of type String adn age an int.

       Check that the values for the parameters for first name and last name
       isn't empty strings or null before assigning the values to the corresponding
       instance variables. If any value is empty or null assign a default value of your choice
       that will inform a user that this value isn't really set.

       Check the value of the parameter for age so that this is not null or a value
       less than 0 (negative age is not allowed). If age is a value less than 0 
       or null set the value of age to 0.

       If the parameter for the Address-object is null create an Address-object
       by using the default constructor for class Address.
     */

    public Guest(String firstName, String lastName, int age, Address address) {
        if(firstName != null && !firstName.isEmpty()){
            this.firstName = firstName;
        }else{
            this.firstName = "Default first name";
        }

        if(lastName != null && !lastName.isEmpty()){
            this.lastName = lastName;
        } else{
            this.lastName = "Default first name";
        }

        if(age > 0){
            this.age = age;
        }else{
            this.age = 0;
        }

        if(address != null) {
            this.address = address;
        }else{
            this.address = new Address();
        }

    }

    /* Write a constructor with parameters for all instance variables
       given above and all instance variables for the address.
       Create the Address-object with the values given in the parameters.
       Let the Address class take care of assigning default values if any
       parameters for this object is an empty string or null.
   */

    public Guest(String firstName, String lastName, int age, Address address, String street, String city, String zipCode, Countries country){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        address = new Address(street, city, zipCode, country);

    }

    /* Implement get- and set-methods for all instance variables,
       including variables matching the instance variables of
       the Address-object (those call getters and setters in the Address-object).

       Remember to check parameters in set-methods with the same
       rules as in the constructor above.
     */

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName) {
        if((firstName != null && !firstName.isEmpty())){
            this.firstName = firstName;
        } else {
            this.firstName = "Default first name";
        }
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName) {
        if((lastName != null && !lastName.isEmpty())){
            this.lastName = lastName;
        } else {
            this.lastName = "Default last name";
        }
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {
        if((age > 0)){
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    
    public Address getAddress(){
        return address;
    }

    public String getStreet() {
        return address.getStreet();
    }

    public void setStreet(String street) {
            this.address.setStreet(street);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {
        this.address.setCity(city);
    }

    public String getZipCode() {
        return address.getZipCode();
    }

    public void setZipCode(String zipCode) {
        this.address.setZipCode(zipCode);
    }

    public Countries getCountry(){
        return address.getCountry();
    }

    public void setCounty(Countries country) {
        this.address.setCountry(country);
    }


    /* Write a toString method to return a String made of first name,
       last name adn age and the address (by calling the toString method of the Address-object)
       formatted in one line (this will be shown in the window under "Guest Register" ).
     */

    public String toString(){
        return "First name: " + firstName + ", " + "Last name: " + lastName + ", " + "Age: "+ age + ", " + "Address: " + address.toString();
    }

}
