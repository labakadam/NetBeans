/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import safeflyeu.model.Osiguranje;
import safeflyeu.utility.Baza;
import java.sql.PreparedStatement;
import safeflyeu.utility.SafeFlyEUException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author labak
 */
public class ObradaOsiguranje {

    private PreparedStatement izraz;
    private ResultSet rs;

    public List<Osiguranje> read() {
        List<Osiguranje> osiguranja = new ArrayList<>();

        try {
            izraz = Baza.getInstance().getConnection().prepareStatement("select * from osiguranje");
            rs = izraz.executeQuery();
            Osiguranje o;
            while (rs.next()) {
                o = new Osiguranje();
                o.setId(rs.getInt("id"));
                o.setNaziv(rs.getString("naziv"));
                o.setVrsta(rs.getString("vrsta"));
                o.setIban(rs.getString("iban"));
                o.setOib(rs.getString("oib"));
                osiguranja.add(o);
            }
            rs.close();
            izraz.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return osiguranja;
    }

    public Osiguranje create(Osiguranje o) throws SafeFlyEUException {

        kontrola(o);

        try {
            izraz = Baza.getInstance().getConnection().prepareStatement("insert into osiguranje (naziv,vrsta,iban,oib)values (?,?,?,?)", Statement.RETURN_GENERATED_KEYS);
            izraz.setString(1, o.getNaziv());
            izraz.setString(2, o.getVrsta());
            izraz.setString(3, o.getIban());
            izraz.setString(4, o.getOib());

            izraz.executeUpdate();
            rs = izraz.getGeneratedKeys();
            rs.next();
            o.setId(rs.getInt(1));

            rs.close();
            izraz.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return o;
    }

    public boolean delete(Osiguranje o) {

        try {

            izraz = Baza.getInstance().getConnection().prepareStatement("delete from osiguranje where id=?");
            izraz.setInt(1, o.getId());
            return izraz.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     *
     * @param o
     * @return
     *
     * @throws safeflyeu.utility.SafeFlyEUException
     * @throws SafeFlyEUException
     */
    public boolean update(Osiguranje o) throws SafeFlyEUException {

        kontrola(o);

        try {
            izraz = Baza.getInstance().getConnection().prepareStatement("Update osiguranje set naziv=?, vrsta=?, iban=?, oib=? where id=?");
            izraz.setString(1, o.getNaziv());
            izraz.setString(2, o.getVrsta());
            izraz.setString(3, o.getIban());
            izraz.setString(4, o.getOib());

            return izraz.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    private void kontrola(Osiguranje o) throws SafeFlyEUException {
        if (o.getNaziv() == null) {
            throw new SafeFlyEUException("Naziv je null, obavezan unos");
        }
        if (o.getNaziv().trim().length() == 0) {
            throw new SafeFlyEUException(("Naziv je prazan, obavezan unos"));
        }
        if (o.getNaziv().length() > 50) {
            throw new SafeFlyEUException("Dužina naziva je veća od dopuštene");
        }
        if (o.getVrsta() == null) {
            throw new SafeFlyEUException("Vrsta je null, obavezan unos");
        }
        if (o.getVrsta().trim().length() == 0) {
            throw new SafeFlyEUException(("Vrsta je prazna, obavezan unos"));
        }
        if (o.getVrsta().length() > 50) {
            throw new SafeFlyEUException("Dužina vrste je veća od dopuštene");
        }
        if (o.getIban() == null) {
            throw new SafeFlyEUException("Iban je null, obavezan unos");
        }
        if (o.getIban().trim().length() == 0) {
            throw new SafeFlyEUException(("Iban je prazan, obavezan unos"));
        }
        if (o.getIban().length() > 21) {
            throw new SafeFlyEUException("Dužina iban-a je veća od dopuštene");
        }
        if (o.getIban().length() < 21) {
            throw new SafeFlyEUException("Dužina iban-a je manja od dopuštene");
        }
        if (o.getOib() == null) {
            throw new SafeFlyEUException("Oib je null, obavezan unos");
        }
        if (o.getOib().trim().length() == 0) {
            throw new SafeFlyEUException(("Oib je prazan, obavezan unos"));
        }
        if (o.getOib().length() > 11) {
            throw new SafeFlyEUException("Dužina oib-a je veća od dopuštene");
        }
        if (o.getOib().length() < 11) {
            throw new SafeFlyEUException("Dužina oib-a je manja od dopuštene");
        }
    }

}
