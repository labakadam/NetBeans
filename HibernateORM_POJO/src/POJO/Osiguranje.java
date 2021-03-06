package POJO;
// Generated 23.02.2019. 00:17:59 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Osiguranje generated by hbm2java
 */
public class Osiguranje  implements java.io.Serializable {


     private Integer id;
     private String naziv;
     private String vrsta;
     private String iban;
     private String oib;
     private Set korisniks = new HashSet(0);
     private Set aviokompanijas = new HashSet(0);

    public Osiguranje() {
    }

	
    public Osiguranje(String naziv, String vrsta, String iban) {
        this.naziv = naziv;
        this.vrsta = vrsta;
        this.iban = iban;
    }
    public Osiguranje(String naziv, String vrsta, String iban, String oib, Set korisniks, Set aviokompanijas) {
       this.naziv = naziv;
       this.vrsta = vrsta;
       this.iban = iban;
       this.oib = oib;
       this.korisniks = korisniks;
       this.aviokompanijas = aviokompanijas;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNaziv() {
        return this.naziv;
    }
    
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    public String getVrsta() {
        return this.vrsta;
    }
    
    public void setVrsta(String vrsta) {
        this.vrsta = vrsta;
    }
    public String getIban() {
        return this.iban;
    }
    
    public void setIban(String iban) {
        this.iban = iban;
    }
    public String getOib() {
        return this.oib;
    }
    
    public void setOib(String oib) {
        this.oib = oib;
    }
    public Set getKorisniks() {
        return this.korisniks;
    }
    
    public void setKorisniks(Set korisniks) {
        this.korisniks = korisniks;
    }
    public Set getAviokompanijas() {
        return this.aviokompanijas;
    }
    
    public void setAviokompanijas(Set aviokompanijas) {
        this.aviokompanijas = aviokompanijas;
    }




}


