package FelixWilking;

public abstract class Person {

    //Fields
    String firstName;
    String lastName;

    //Constructor
    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Person() {

    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    //methods - Setters
    public abstract String toString();
    public boolean equals(Person p){
        if(firstName.equals(lastName)){
            return true;
        }else{
            return false;
        }
    }
    
}
