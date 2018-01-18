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
public class Ogretmenler
{
    private int ogretmenId ;
    private String ogretmenAdi ;
    private String ogretmenSoyadi ;

    /**
     * @return the ogretmenId
     */
    public int getOgretmenId() {
        return ogretmenId;
    }

    /**
     * @param ogretmenId the ogretmenId to set
     */
    public void setOgretmenId(int ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    /**
     * @return the ogretmenAdi
     */
    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    /**
     * @param ogretmenAdi the ogretmenAdi to set
     */
    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }

    /**
     * @return the ogretmenSoyadi
     */
    public String getOgretmenSoyadi() {
        return ogretmenSoyadi;
    }

    /**
     * @param ogretmenSoyadi the ogretmenSoyadi to set
     */
    public void setOgretmenSoyadi(String ogretmenSoyadi) {
        this.ogretmenSoyadi = ogretmenSoyadi;
    }
}
