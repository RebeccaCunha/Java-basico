/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Testefuncao.testefuncao01;

/**
 *
 * @author Rebecca
 */
public class Testefuncao01 {

    /**
     * @param args the command line arguments
     */
    
    static int soma(int a, int b) {
        int s = a + b;
       return s;
    }
    public static void main(String[] args) {
        
        int resultado = soma(5,2);
        System.out.println("A soma vale " + resultado + ".");
    }
    
}
