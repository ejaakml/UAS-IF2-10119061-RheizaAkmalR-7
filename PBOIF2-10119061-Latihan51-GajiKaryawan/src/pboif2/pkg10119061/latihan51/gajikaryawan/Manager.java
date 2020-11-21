/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan51.gajikaryawan;

/**
 *
 * @author Rheiza
 */
public class Manager extends Karyawan {
    private int kehadiran;
    private float tunjanganGolongan,tunjanganJabatan,tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        return tunjanganKehadiran = hadir * 10000;
    }
    
    public float tunjanganJabatan(String jabatan) {

        if (jabatan.equals("Manager") || jabatan.equals("manager")) {
            tunjanganJabatan = 2000000;
        } else if (jabatan.equals("Kabag") || jabatan.equals("kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
    }
    
    public float tunjanganGolongan (int golongan) {

        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                break;
            case 2:
                tunjanganGolongan = 1000000;
                break;
            case 3:
                tunjanganGolongan = 1500000;
                break;
            default:
                tunjanganGolongan = 0;
                break;
        }
        return tunjanganGolongan;
    }
    
    public float gajiTotal() {
        return tunjanganKehadiran + tunjanganJabatan + tunjanganGolongan;
    }
    
}
