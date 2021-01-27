/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjdbcmvc.main;

import java.sql.SQLException;
import java.util.List;
import latihanjdbcmvc.database.KingsBarberShopDatabase;
import latihanjdbcmvc.entity.Pelanggan;
import latihanjdbcmvc.error.PelangganException;
import latihanjdbcmvc.service.PelangganDao;

/** 
 *
 * @author Rheiza
 */
public class LatihanJDBCMVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here
        PelangganDao dao = KingsBarberShopDatabase.getPelangganDao(); 
      Pelanggan pelanggan = new Pelanggan();
      pelanggan.setNama("RIZKI ADAM");
      pelanggan.setAlamat("Jalan semar");
      pelanggan.setTelepon("0812121231");
      pelanggan.setEmail("Rizkiadam018@gmail.com");
        dao.deletePelanggan(1);
        }
  
    }
    
