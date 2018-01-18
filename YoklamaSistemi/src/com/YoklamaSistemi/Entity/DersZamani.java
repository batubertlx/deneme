/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.YoklamaSistemi.Entity;

/**
 *
 * @author ogrenci
 */
public class DersZamani 
{
    private int dersZamaniId ;
    private String dersGunu ;
    private String dersBaslangicSaati ;
    private String dersBitisSaati ;

    /**
     * @return the dersZamaniId
     */
    public int getDersZamaniId() {
        return dersZamaniId;
    }

    /**
     * @param dersZamaniId the dersZamaniId to set
     */
    public void setDersZamaniId(int dersZamaniId) {
        this.dersZamaniId = dersZamaniId;
    }

    /**
     * @return the dersGunu
     */
    public String getDersGunu() {
        return dersGunu;
    }

    /**
     * @param dersGunu the dersGunu to set
     */
    public void setDersGunu(String dersGunu) {
        this.dersGunu = dersGunu;
    }

    /**
     * @return the dersBaslangıcSaati
     */
    public String getDersBaslangicSaati() {
        return dersBaslangicSaati;
    }

    /**
     * @param dersBaslangicSaati the dersBaslangıcSaati to set
     */
    public void setDersBaslangicSaati(String dersBaslangicSaati) {
        this.dersBaslangicSaati = dersBaslangicSaati;
    }

    /**
     * @return the dersBitisSaati
     */
    public String getDersBitisSaati() {
        return dersBitisSaati;
    }

    /**
     * @param dersBitisSaati the dersBitisSaati to set
     */
    public void setDersBitisSaati(String dersBitisSaati) {
        this.dersBitisSaati = dersBitisSaati;
    }
}
