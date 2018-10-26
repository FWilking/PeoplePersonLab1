package FelixWilking;
//yes

public abstract class Student extends Person{
    private double GPA;
    private int OSIS;
    private int actScore;
    public Student(String firstName, String lastName, double GPA, int OSIS,int actScore){
        super(firstName,lastName);
        this.GPA=GPA;
        this.OSIS=OSIS;
        this.actScore=actScore;
    }
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }
}
