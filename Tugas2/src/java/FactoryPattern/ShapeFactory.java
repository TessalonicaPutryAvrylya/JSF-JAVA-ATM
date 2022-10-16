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
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        
        if(shapeType.equalsIgnoreCase("GAGAL")){
            return new Gagal();
        }else if(shapeType.equalsIgnoreCase("BERHASIL")){
            return new Berhasil();
        }
        return null;
    }
}
