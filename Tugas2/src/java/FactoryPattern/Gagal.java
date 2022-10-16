/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryPattern;

/**
 *
 * @author LENOVO
 */
public class Gagal implements Shape{
    @Override
    public String draw() {
        return "Saldo Anda Tidak Cukup";
    }
}
