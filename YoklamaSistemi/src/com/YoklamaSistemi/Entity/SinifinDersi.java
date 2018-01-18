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
public class SinifinDersi
{
    private int sinifinDersiId ;
    private Siniflar sinifId ;
    private GirdigiDersler girdigiDerslerId ;

    /**
     * @return the sinifinDersiId
     */
    public int getSinifinDersiId() {
        return sinifinDersiId;
    }

    /**
     * @param sinifinDersiId the sinifinDersiId to set
     */
    public void setSinifinDersiId(int sinifinDersiId) {
        this.sinifinDersiId = sinifinDersiId;
    }

    /**
     * @return the sinifId
     */
    public Siniflar getSinifId() {
        return sinifId;
    }

    /**
     * @param sinifId the sinifId to set
     */
    public void setSinifId(Siniflar sinifId) {
        this.sinifId = sinifId;
    }

    /**
     * @return the girdigiDerslerId
     */
    public GirdigiDersler getGirdigiDerslerId() {
        return girdigiDerslerId;
    }

    /**
     * @param girdigiDerslerId the girdigiDerslerId to set
     */
    public void setGirdigiDerslerId(GirdigiDersler girdigiDerslerId) {
        this.girdigiDerslerId = girdigiDerslerId;
    }
}
