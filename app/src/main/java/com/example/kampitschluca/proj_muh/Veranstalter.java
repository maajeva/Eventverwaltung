package com.example.kampitschluca.proj_muh;

public class Veranstalter {
    private int id;
    private String firmenname;
    private String vorname;
    private String nachname;
    private String passwort;
    private String benutzername;
    private String email;
    private String adresse;
    private String postleizahl;
    private String telNr;
   // private static ObservableList<Veranstaltung> veranstaltungen = null;

    public Veranstalter() {
    }

    public Veranstalter(int id, String firmenname, String vorname, String nachname, String passwort, String benutzername, String email, String adresse, String postleizahl, String telNr) {
        this.id = id;
        this.firmenname = firmenname;
        this.vorname = vorname;
        this.nachname = nachname;
        this.passwort = passwort;
        this.benutzername = benutzername;
        this.email = email;
        this.adresse = adresse;
        this.postleizahl = postleizahl;
        this.telNr = telNr;
    }

    public Veranstalter(String firmenname, String vorname, String nachname, String passwort, String benutzername, String email, String adresse, String postleizahl, String telNr) {
        this.firmenname = firmenname;
        this.vorname = vorname;
        this.nachname = nachname;
        this.passwort = passwort;
        this.benutzername = benutzername;
        this.email = email;
        this.adresse = adresse;
        this.postleizahl = postleizahl;
        this.telNr = telNr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirmenname() {
        return firmenname;
    }

    public void setFirmenname(String firmenname) {
        this.firmenname = firmenname;
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

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPostleizahl() {
        return postleizahl;
    }

    public void setPostleizahl(String postleizahl) {
        this.postleizahl = postleizahl;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }


    @Override
    public String toString() {
        return "Veranstalter{" +
                "id=" + id +
                ", firmenname='" + firmenname + '\'' +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", passwort='" + passwort + '\'' +
                ", benutzername='" + benutzername + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postleizahl='" + postleizahl + '\'' +
                ", telNr=" + telNr +
                '}';
    }
}
