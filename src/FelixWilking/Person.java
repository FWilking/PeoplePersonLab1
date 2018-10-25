package FelixWilking;

public abstract class Person {
    String firstName;
    String lastName;
    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public abstract String toString();
    public boolean equals(Person p){
        if(firstName.equals(lastName)){
            return true;
        }else{
            return false;
        }
    }
    
}
