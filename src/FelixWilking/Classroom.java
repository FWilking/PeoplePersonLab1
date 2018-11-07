package FelixWilking;

public abstract class Classroom extends Person {
   private teacher teacher;
   private Student[] student;

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    public Classroom (Student[] student, teacher teacher ) {
        super(firstName, lastName);
        this.student = student;
        this.teacher = teacher;
    }
    //no idea how the firstName and lastName referencing works
    //it would not reference the subject
    public String getSubject() { return super(subject);}
    }

}
