

public class Employee{
    private final String firstName;
    private final String lastName;                               
    private final String socialSecurityNumber;
    //Creating the Employee superclass   
public Employee(String firstName, String lastName, String socialSecurityNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.socialSecurityNumber = socialSecurityNumber;
}
//Getter methods below
public String getFirstName(){
    return firstName;
} 
public String getLastName(){
    return lastName;
}
public String getSocialSecurityNumber(){
    return socialSecurityNumber;
}
}