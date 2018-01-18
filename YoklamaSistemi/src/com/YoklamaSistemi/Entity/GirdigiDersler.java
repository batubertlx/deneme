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
public class GirdigiDersler 
{
   private int girdigiDersId ;
    private Ogretmenler ogretmenId ;
    private DersZamani dersZamaniId ;
    private Dersler dersId ;

    /**
     * @return the girdigiDersId
     */
    public int getGirdigiDersId() {
        return girdigiDersId;
    }

    /**
     * @param girdigiDersId the girdigiDersId to set
     */
    public void setGirdigiDersId(int girdigiDersId) {
        this.girdigiDersId = girdigiDersId;
    }

    /**
     * @return the ogretmenId
     */
    public Ogretmenler getOgretmenId() {
        return ogretmenId;
    }

    /**
     * @param ogretmenId the ogretmenId to set
     */
    public void setOgretmenId(Ogretmenler ogretmenId) {
        this.ogretmenId = ogretmenId;
    }

    /**
     * @return the dersZamaniId
     */
    public DersZamani getDersZamaniId() {
        return dersZamaniId;
    }

    /**
     * @param dersZamaniId the dersZamaniId to set
     */
    public void setDersZamaniId(DersZamani dersZamaniId) {
        this.dersZamaniId = dersZamaniId;
    }

    /**
     * @return the dersId
     */
    public Dersler getDersId() {
        return dersId;
    }

    /**
     * @param dersId the dersId to set
     */
    public void setDersId(Dersler dersId) {
        this.dersId = dersId;
    }
}
