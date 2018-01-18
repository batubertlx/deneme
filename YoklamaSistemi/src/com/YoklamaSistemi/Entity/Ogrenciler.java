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
public class Ogrenciler 
{
    private int ogrenciNo ;
    private String ogrenciAdi ;
    private String ogrenciSoyadi ;
    private Siniflar ogrenciSinifi ;

    /**
     * @return the ogrenciNo
     */
    public int getOgrenciNo() {
        return ogrenciNo;
    }

    /**
     * @param ogrenciNo the ogrenciNo to set
     */
    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    /**
     * @return the ogrenciAdi
     */
    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    /**
     * @param ogrenciAdi the ogrenciAdi to set
     */
    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    /**
     * @return the ogrenciSoyadi
     */
    public String getOgrenciSoyadi() {
        return ogrenciSoyadi;
    }

    /**
     * @param ogrenciSoyadi the ogrenciSoyadi to set
     */
    public void setOgrenciSoyadi(String ogrenciSoyadi) {
        this.ogrenciSoyadi = ogrenciSoyadi;
    }


    @Override
    public String toString() 
    {
        return this.ogrenciAdi+ " "+ this.ogrenciSoyadi;
    }

    /**
     * @return the ogrenciSinifi
     */
    public Siniflar getOgrenciSinifi() {
        return ogrenciSinifi;
    }

    /**
     * @param ogrenciSinifi the ogrenciSinifi to set
     */
    public void setOgrenciSinifi(Siniflar ogrenciSinifi) {
        this.ogrenciSinifi = ogrenciSinifi;
    }
    
    
    
}
