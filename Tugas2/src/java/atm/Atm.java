/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm;

import AbFactoryPattern.*;
import FactoryPattern.Shape;
import FactoryPattern.ShapeFactory;
import SingletonPattern.Singleton_Ceksaldo;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
@Named("atm")
@SessionScoped
public class Atm implements Serializable{
    private int tarik;
    private int setor;
    int saldo = 500000;
    
    public int getTarik() {
        return tarik;
    }
    
    public void setSetor(int setor){   
        this.setor = setor;
    }
    
    public int getSetor() {
        return setor;
    }
    
    public void setTarik(int tarik){   
        this.tarik = tarik;
    }
    
    public String cekSaldo(){
        Singleton_Ceksaldo object = Singleton_Ceksaldo.getInstance();
        return object.showSaldo(saldo);
    }
    public String tarikSaldo(){
        ShapeFactory shapeFactory = new ShapeFactory();
            if(saldo-tarik<100000){
                Shape shape = shapeFactory.getShape("GAGAL");
                return shape.draw();
            }else{
                saldo-=tarik;
                Shape shape = shapeFactory.getShape("BERHASIL");
                return shape.draw();
            }
    }
    public String setorSaldo(){
        AbFactory uangFactory = FactoryProducer.getFactory("UANG");
        AbFactory kondisiFactory = FactoryProducer.getFactory("KONDISI");
        
        if(setor%50000!=0){
            Uang uang1 = uangFactory.getUang("UANG");
            Kondisi kondisi1 = kondisiFactory.getKondisi("GAGAL");
            return uang1.draw(setor)+", "+kondisi1.fill();
        }else{
            saldo+=setor;
            Uang uang1 = uangFactory.getUang("UANG");  
            Kondisi kondisi1 = kondisiFactory.getKondisi("BERHASIL");
            return uang1.draw(setor)+", "+kondisi1.fill();
        }
    }
}
