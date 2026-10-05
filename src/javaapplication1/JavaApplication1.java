/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
        

/**
 *
 * @author Usuario
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int prendas = 0;
        double sub_total = 0,total = 0,descuento = 0,valor_p = 0;
        System.out.print("Ingrese la cantidad de prendas: ");
        prendas = sc.nextInt();
        for (int i = 0; i < prendas; i++) {
            System.out.print("Ingrese el valor de la prenda " +(i+1)+":");
            valor_p =sc.nextDouble();
            sub_total = sub_total + valor_p ; 
        }
        if (sub_total >= 100) {
            descuento = sub_total * 0.1 ;
        }else if (sub_total >= 200) {
            descuento = sub_total *0.15 ;
        }else if (sub_total >= 300) {
            descuento = sub_total * 0.2 ;
        }else{
            descuento = sub_total * 0 ;
        }
        total = sub_total- descuento;
        System.out.println("El valor total es: ");    
    }
    
}
