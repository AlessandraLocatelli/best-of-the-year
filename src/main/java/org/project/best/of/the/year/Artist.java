package org.project.best.of.the.year;

public class Artist {


    private String firstName;
    private String lastName;

    public Artist(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Artist()
    {

    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
