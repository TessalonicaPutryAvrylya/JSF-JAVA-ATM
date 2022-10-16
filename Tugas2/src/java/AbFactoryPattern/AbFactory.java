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
public abstract class AbFactory {
    public abstract Kondisi getKondisi(String kondisi);
    public abstract Uang getUang(String uang);
}
