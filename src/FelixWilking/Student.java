package FelixWilking;
//yes

public abstract class Student extends Person{
    double GPA;
    int OSIS;
    int actScore;
    public Student(double GPA, int OSIS,int actScore){
        super();

    }
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
