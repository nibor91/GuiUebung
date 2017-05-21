package com.sabel;

/**
 * Created by robin on 21.05.17.
 */
public class Person {
    private int gebJahr;
    private String vorname;
    private String nachname;
    private boolean male;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (gebJahr != person.gebJahr) return false;
        if (male != person.male) return false;
        if (vorname != null ? !vorname.equals(person.vorname) : person.vorname != null) return false;
        return nachname != null ? nachname.equals(person.nachname) : person.nachname == null;
    }

    @Override
    public int hashCode() {
        int result = gebJahr;
        result = 31 * result + (vorname != null ? vorname.hashCode() : 0);
        result = 31 * result + (nachname != null ? nachname.hashCode() : 0);
        result = 31 * result + (male ? 1 : 0);
        return result;
    }

    public int getGebJahr() {

        return gebJahr;
    }

    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }
}
