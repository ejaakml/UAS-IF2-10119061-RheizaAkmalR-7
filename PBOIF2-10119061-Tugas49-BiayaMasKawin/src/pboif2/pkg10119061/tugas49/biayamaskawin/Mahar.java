/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.tugas49.biayamaskawin;

/**
 *
 * @author Rheiza
 */
class Mahar {
    private double beratMahar,hargaMahar;

    public double getBeratMahar() {
        return beratMahar;
    }

    public void setBeratMahar(double beratMahar) {
        this.beratMahar = beratMahar;
    }

    public double getHargaMahar() {
        return hargaMahar;
    }

    public void setHargaMahar(double hargaMahar) {
        this.hargaMahar = hargaMahar;
    }
    
    public double hitungTotalMahar(double hargaMahar, double beratMahar) {
        return hargaMahar * beratMahar;
    }            
}

