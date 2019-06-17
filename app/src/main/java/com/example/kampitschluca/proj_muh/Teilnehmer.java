package com.example.kampitschluca.proj_muh;

public class Teilnehmer {
    private int id;
    private String vorname;
    private String nachname;
    private String benutzername;
    private String passwort;
    private String email;
    private String telNr;
    //private static ObservableList<Veranstaltung> veranstaltungen = null;


    public Teilnehmer(int id, String vorname, String nachname, String benutzername, String passwort, String email, String telNr) {
        this.id = id;
        this.vorname = vorname;
        this.nachname = nachname;
        this.benutzername = benutzername;
        this.passwort = passwort;
        this.email = email;
        this.telNr = telNr;
    }

    public Teilnehmer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    @Override
    public String toString() {
        return "Teilnehmer{" +
                "id=" + id +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", benutzername='" + benutzername + '\'' +
                ", passwort='" + passwort + '\'' +
                ", email='" + email + '\'' +
                ", telNr=" + telNr +
                '}';
    }
}
