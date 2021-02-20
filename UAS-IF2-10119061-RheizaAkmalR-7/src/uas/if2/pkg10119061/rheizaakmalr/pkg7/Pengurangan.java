/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas.if2.pkg10119061.rheizaakmalr.pkg7;

/**
 *
 * @author Rheiza
 */
public class Pengurangan extends Bilangan {

    public void kurangkan() {
        int selisih = this.getNilai1() - this.getNilai2();
        System.out.println("Hasil Pengurangan = " + selisih);
    }
    
}
