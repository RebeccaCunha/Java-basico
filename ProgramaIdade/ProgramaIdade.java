package ProgramaIdade;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;
/**
 *
 * @author Rebecca
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try (Scanner t = new Scanner(System.in)) {
            System.out.print("Em que ano voce nasceu? ");
            int nasc = t.nextInt();
            int i = 2024-nasc;
            System.out.print("Sua idade é " + i);
            if (i>= 18){
                System.out.print(" anos, e voce é maior de idade.");
            } else {
                System.out.println("anos, e você é menor de idade.");
            }
        } 
    }
    
}