/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_9_5;

import javax.swing.JOptionPane;

public class Serie {
    private int num;
    public Serie (){
        do{
        String respuesta = JOptionPane.showInputDialog("Introduzca un numero que quiere");
        num = Integer.parseInt(respuesta);
        }while (num < 0);
    }
    public void tresSeries (){
        int suma = 0;
        String seriepar = "";
        String serieNP = "";
        String fibo = "";
        for (int i=1; i<=num;i++){
            suma = suma+2;
            if (i==num){
                seriepar = seriepar + suma;
            }
            else
                seriepar = seriepar + suma + " + ";    
        }
        for (int i=1; i<=num;i++){
            if (i%2==0){
                if (i==num){
                    serieNP = serieNP + i;
                }
                else 
                    serieNP = serieNP + i + " - "; 
            }
            else{
                if (i==num)
                    serieNP = serieNP + i;
                else {
                    if (i==1){
                    serieNP = serieNP + " - " + i + " + ";
                    }
                    else{
                    serieNP = serieNP + i + " + "; 
                    }
                }
            }
        }
        int a = 0;
        int b = 1;
        String serieFi = a + ", "+ b + ", ";
        for(int i=3; i<=num; i++){
            if (i%2 == 0){
                b = b + a;
                serieFi = serieFi + b + ", " ;
            }
            else{
                a = a + b;
                serieFi = serieFi + a + ", ";
            }  
        }
       
        JOptionPane.showMessageDialog(null, seriepar + "\n" + serieNP + "\n" +serieFi);
    }
}
