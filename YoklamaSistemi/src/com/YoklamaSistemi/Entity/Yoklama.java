/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.YoklamaSistemi.Entity;

import java.util.Date;

/**
 *
 * @author ogrenci
 */
public class Yoklama 
{
    private int yoklamaId ;
    private Ogrenciler ogrenciNo;
    private Date tarih  ;

    /**
     * @return the yoklamaId
     */
    public int getYoklamaId() {
        return yoklamaId;
    }

    /**
     * @param yoklamaId the yoklamaId to set
     */
    public void setYoklamaId(int yoklamaId) {
        this.yoklamaId = yoklamaId;
    }

    /**
     * @return the ogrenciNo
     */
    public Ogrenciler getOgrenciNo() {
        return ogrenciNo;
    }

    /**
     * @param ogrenciNo the ogrenciNo to set
     */
    public void setOgrenciNo(Ogrenciler ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    /**
     * @return the tarih
     */
    public Date getTarih() {
        return tarih;
    }

    /**
     * @param tarih the tarih to set
     */
    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
    
    
    
}
