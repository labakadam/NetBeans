package POJO;
// Generated 23.02.2019. 00:17:59 by Hibernate Tools 4.3.1



/**
 * Korisnik generated by hbm2java
 */
public class Korisnik  implements java.io.Serializable {


     private Integer id;
     private Osiguranje osiguranje;
     private String ime;
     private String prezime;
     private String oib;
     private String email;
     private Integer brojMobitela;

    public Korisnik() {
    }

	
    public Korisnik(Osiguranje osiguranje, String ime, String prezime, String oib, String email) {
        this.osiguranje = osiguranje;
        this.ime = ime;
        this.prezime = prezime;
        this.oib = oib;
        this.email = email;
    }
    public Korisnik(Osiguranje osiguranje, String ime, String prezime, String oib, String email, Integer brojMobitela) {
       this.osiguranje = osiguranje;
       this.ime = ime;
       this.prezime = prezime;
       this.oib = oib;
       this.email = email;
       this.brojMobitela = brojMobitela;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Osiguranje getOsiguranje() {
        return this.osiguranje;
    }
    
    public void setOsiguranje(Osiguranje osiguranje) {
        this.osiguranje = osiguranje;
    }
    public String getIme() {
        return this.ime;
    }
    
    public void setIme(String ime) {
        this.ime = ime;
    }
    public String getPrezime() {
        return this.prezime;
    }
    
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }
    public String getOib() {
        return this.oib;
    }
    
    public void setOib(String oib) {
        this.oib = oib;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getBrojMobitela() {
        return this.brojMobitela;
    }
    
    public void setBrojMobitela(Integer brojMobitela) {
        this.brojMobitela = brojMobitela;
    }




}


