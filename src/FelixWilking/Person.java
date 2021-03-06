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
        return firstName.equals(lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
