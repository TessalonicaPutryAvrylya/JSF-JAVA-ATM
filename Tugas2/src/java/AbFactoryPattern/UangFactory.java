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
public class UangFactory extends AbFactory {
    @Override
    public Uang getUang(String uang) {
        if(uang == null)
            return null;
        if(uang.equalsIgnoreCase("UANG")){
            return new BesarUang();
        }
        return null;  
    }

    @Override
    public Kondisi getKondisi(String kondisi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
