package FelixWilking;

public abstract class team extends Person {

    //Fields
    private String sport;
    private String position;

    //Constructors
    public team(String firstName, String lastName, String sport)
    {
        super(firstName, lastName);
        this.sport = sport;
    }

    public team(String position)
    {
        this.position = position;
    }

    //methods - Getters
    public String getSport() { return sport; }
    public String getPosition() { return position; }

    //methods - Setters
    public void setSport(String sport) { this.sport = sport; }
    public void setPosition(String position) { this.position = position; }
}
