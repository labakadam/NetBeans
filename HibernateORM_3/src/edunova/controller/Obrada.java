/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.controller;

/**
 *
 * @author Profesor
 * @param <T>
 */
public abstract class Obrada<K> {

    protected DAO<K> dao;

    public Obrada() {
        dao = new DAO<>();
    }

}
