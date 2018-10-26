package FelixWilking;

public abstract class teacher extends Person {

    //Fields
    private String title;      //Mr,Ms,Mx,Mrs
    private String subject;

    //Constructors
    public teacher(String firstName, String lastName, String title)
    {
        super(firstName, lastName);
        this.title = title;
    }

    public teacher(String subject)
    {
        this.subject = subject;
    }

    //methods - Getters
    public String getTitle() { return title; }
    public String getSubject() { return subject; }

    //methods - Setters
    public void setTitle(String title) { this.title = title; }
    public void setSubject(String subject) { this.subject = subject; }
}
