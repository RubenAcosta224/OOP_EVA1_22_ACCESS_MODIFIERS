/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PAQUETE1;

import PAQUETE2.CLASE_E;

/**
 *
 * @author invitado
 */
public class CLASE_A {
    public int publicA;
    int defaultA;
    private int privateA;
    //default solo se ve en el mismo paquete, default es no poner public o private creo, creo que si
    
    public void prueba(){
        CLASE_B objB=new CLASE_B();
//        objB.defaultB; ATRIBUTOS visibles
//        objB.publicB; 
        
        
        
////        otro archivo pero mismo paquete
        CLASE_D objD=new CLASE_D();
//        objD.defaultD
//        objD.publicD
        
        
        //esta en otro paquete y archivo
        //se importa
        CLASE_E objE=new CLASE_E();
//        objE.publicE
        
        
        //clase f es default y es invisible para las clases de este paquiete
//        CLASE_F objF=new CLASE_F();
    }
}

class CLASE_B{
    public int publicB;
    int defaultB;
    private int privateB;
    
    
}
