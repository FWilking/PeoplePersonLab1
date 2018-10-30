package FelixWilking;

public abstract class Classroom extends Person {
   private teacher teacher;
   private Student[] student;

    public Classroom (Student[] student, teacher teacher; ) {
        super(firstName, lastName);
        this.student = student;
        this.teacher = teacher;
    }
    public String getSubject() { return subject(); }
    }

}
