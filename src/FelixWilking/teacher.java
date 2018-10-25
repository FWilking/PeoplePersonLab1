package FelixWilking;

public abstract class teacher extends Person {

    private String title;
    private String subject;

    public teacher(String firstName, String lastName, String subject, String title) {
        super(firstName, lastName);
        this.subject = subject;
        this.title = title;
    }
}
