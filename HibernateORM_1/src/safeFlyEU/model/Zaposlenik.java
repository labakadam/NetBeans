/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeFlyEU.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author labak
 */
@Entity
@Table
public class Zaposlenik extends Entitet implements Serializable {

   
    private int avioKomapnija;
    private String ime;
    private String prezime;
    private String email;
    private int brojMobitela;
    private int brojUgovora;
    private String oib;

    public int getAvioKomapnija() {
        return avioKomapnija;
    }

    public void setAvioKomapnija(int avioKomapnija) {
        this.avioKomapnija = avioKomapnija;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBrojMobitela() {
        return brojMobitela;
    }

    public void setBrojMobitela(int brojMobitela) {
        this.brojMobitela = brojMobitela;
    }

    public int getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(int brojUgovora) {
        this.brojUgovora = brojUgovora;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

}
