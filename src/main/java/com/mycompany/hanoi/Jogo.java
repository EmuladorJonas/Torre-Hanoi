/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hanoi;

/**
 *
 * @author JONAS
 */
public class Jogo {
    
    static void movimento(int O, int D)
    {
        System.out.println("MOVIMENTO: " + O + "->" + D);
    }
    
    static void hanoi(int discos, int O, int D, int A) // n= discos, O= Pino Origem, D= Pino Destino, A= Pino Auxiliar
    {
        if(discos>0)
        {
            hanoi(discos-1, O, A, D);
            movimento(O, D);
            hanoi(discos-1, A, D, O);
        }
    } 
}
