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
public class AvioKompanija extends Entitet implements Serializable {

    @ManyToOne
    private AvioKompanija avioKompanija;

    private String naziv;
    private String let;
    private String avion;
    private String oib;
    private String iban;

    public AvioKompanija getAvioKompanija() {
        return avioKompanija;
    }

    public void setAvioKompanija(AvioKompanija avioKompanija) {
        this.avioKompanija = avioKompanija;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getLet() {
        return let;
    }

    public void setLet(String let) {
        this.let = let;
    }

    public String getAvion() {
        return avion;
    }

    public void setAvion(String avion) {
        this.avion = avion;
    }

    public String getOib() {
        return oib;
    }

    public void setOib(String oib) {
        this.oib = oib;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
    

}
