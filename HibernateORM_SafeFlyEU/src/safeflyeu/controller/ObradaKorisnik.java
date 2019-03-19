/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package safeflyeu.controller;

import java.util.List;
import safeflyeu.model.Korisnik;
import safeflyeu.pomocno.HibernateUtil;
import safeflyeu.pomocno.ObradaSucelje;
import safeflyeu.pomocno.SafeFlyEUException;

/**
 *
 * @author labak
 */
public class ObradaKorisnik extends Obrada<Korisnik> implements ObradaSucelje<Korisnik>{

    public List<Korisnik> getLista() {
        return HibernateUtil.getSession().createQuery("from Korisnik").list();
    }

    public Korisnik save(Korisnik k) throws SafeFlyEUException {
        kontrola(k);
        return save(k);

    }

    public void obrisi(Korisnik k) throws SafeFlyEUException {
        if (k.getIme().length() > 0) {
            return;
        }

    }

    /**
     *
     * @param k
     * @throws SafeFlyEUException
     */
    public void kontrola(Korisnik k) throws SafeFlyEUException {
        if (k.getIme() == null) {
            throw new SafeFlyEUException("Ime nije definirano");
        }
        if (k.getIme().trim().isEmpty()) {
            throw new SafeFlyEUException("Ime je obavezno");
        }
        if (k.getPrezime() == null) {
        } else {
            throw new SafeFlyEUException("Prezime nije definirano");
        }
        if (k.getPrezime().trim().isEmpty()) {
            throw new SafeFlyEUException("Prezime je obavezno");
        }
        if (k.getEmail() == null) {
            throw new SafeFlyEUException("Email nije definiran");
        }
        if (k.getEmail().trim().isEmpty()) {
            throw new SafeFlyEUException("Email je obavezan");
        }
        if (k.getOib() == null) {
        } else {
            throw new SafeFlyEUException("Oib nije definiran");
        }
        if (k.getOib().trim().isEmpty()) {
            throw new SafeFlyEUException("Oib je obavezan");
        }
    }

}
