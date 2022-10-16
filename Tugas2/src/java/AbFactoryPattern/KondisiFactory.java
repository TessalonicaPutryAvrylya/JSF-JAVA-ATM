/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbFactoryPattern;

/**
 *
 * @author LENOVO
 */
public class KondisiFactory extends AbFactory{

    @Override
    public Kondisi getKondisi(String kondisi) {
        if(kondisi == null)
            return null;
        if(kondisi.equalsIgnoreCase("BERHASIL")){
            return new Berhasil2();
        }else if(kondisi.equalsIgnoreCase("GAGAL")){
            return new Gagal2();
        }
        return null;  
    }

    @Override
    public Uang getUang(String uang) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
