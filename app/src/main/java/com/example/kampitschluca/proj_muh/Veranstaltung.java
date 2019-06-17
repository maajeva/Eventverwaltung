package com.example.kampitschluca.proj_muh;

import java.io.Serializable;
import java.util.Date;

public class Veranstaltung implements Serializable {
    private int id;
    private String bezeichnung;
    private int teilnehmeranzahl;
    private int preis;
    private Date datumVon;
    private Date datumBis;
    private String treffOrt;
  //  private static ObservableList<Teilnehmer> teilnehmer = null;
    //private static ObservableList<Veranstalter> veranstalter = null;


    public Veranstaltung(int id, String bezeichnung, int teilnehmeranzahl, int preis, Date datumVon, Date datumBis, String treffOrt) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.teilnehmeranzahl = teilnehmeranzahl;
        this.preis = preis;
        this.datumVon = datumVon;
        this.datumBis = datumBis;
        this.treffOrt = treffOrt;
    }

    public Veranstaltung() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public int getTeilnehmeranzahl() {
        return teilnehmeranzahl;
    }

    public void setTeilnehmeranzahl(int teilnehmeranzahl) {
        this.teilnehmeranzahl = teilnehmeranzahl;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public Date getDatumVon() {
        return datumVon;
    }

    public void setDatumVon(Date datumVon) {
        this.datumVon = datumVon;
    }

    public Date getDatumBis() {
        return datumBis;
    }

    public void setDatumBis(Date datumBis) {
        this.datumBis = datumBis;
    }

    public String getTreffOrt() {
        return treffOrt;
    }

    public void setTreffOrt(String treffOrt) {
        this.treffOrt = treffOrt;
    }

    @Override
    public String toString() {
        return "Bezeichnung='" + bezeichnung + '\'' +
                ", Max. Teilnehmer=" + teilnehmeranzahl +
                ", Preis=" + preis +
                ", Von=" + datumVon +
                ", Bis=" + datumBis +
                ", Treffort='" + treffOrt + '\'' +
                '}';
    }
}
