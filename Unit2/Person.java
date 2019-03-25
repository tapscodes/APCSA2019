public class Person
{
  private String firstName;
  private String lastName;
  public Person(String fName, String lName){
    firstName = fName;
    lastName = lName;
  } 
  public String toString(){
    return lastName + ", " + firstName;
  } 
}