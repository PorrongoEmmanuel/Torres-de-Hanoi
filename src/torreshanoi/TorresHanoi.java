/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torreshanoi;

/**
 *
 * @author Emmanuel
 */
public class TorresHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    TorresHanoi objeH = new TorresHanoi();
    objeH.torres(3, 1, 2, 3);
    System.out.println("juego acompletado");
    }
    
    //creando metodo recursivo 
    public void torres(int discos, int torre1, int torre2, int torre3){
        //caso base
        if(discos==1){
            System.out.println(" mover disco de torre "+ torre1+ " a torre " + torre3);
            
        }else{
            torres(discos-1, torre1, torre2, torre3);
       System.out.println(" mover disco de torre "+ torre1 + " a torre " + torre3);
       torres(discos-1, torre2, torre1, torre3);
       
        }
       
    }
}
