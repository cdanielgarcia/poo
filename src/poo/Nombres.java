/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class Nombres {
    public static void main(String[] args) {
        List <String> nombres = new ArrayList();
        nombres.add("juan");
        nombres.add("juan");
        nombres.add("elik");
        nombres.add("lucas");
        nombres.add("saray");
        
        for(String n: nombres){
            System.out.println(n);
        }
        
    }
    
    
    
}
