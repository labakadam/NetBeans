/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeFlyEU.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author labak
 */
@Entity
@Table
public class Korisnik extends Entitet implements Serializable {

    @ManyToOne
    private Osiguranje osiguranje;

    

    private String ime;
    private String prezime;
    private String oib;
    private String email;
    private int brojMobitela;

    public Osiguranje getOsiguranje() {
        return osiguranje;
    }

    public void setOsiguranje(Osiguranje osiguranje) {
        this.osiguranje = osiguranje;
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

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
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
    
    

}
