/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingletonPattern;

/**
 *
 * @author LENOVO
 */
public class Singleton_Ceksaldo {
    private static Singleton_Ceksaldo instance = new Singleton_Ceksaldo();
    public static Singleton_Ceksaldo getInstance(){
        return instance;
    }
    
    public String showSaldo(int saldo){
        return "Saldo anda saat ini : "+saldo;
    }
}
