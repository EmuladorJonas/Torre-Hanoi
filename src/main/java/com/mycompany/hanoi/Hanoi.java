/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.hanoi;

import javax.swing.JOptionPane;

/**
 *
 * @author JONAS
 */
public class Hanoi {

    public static void main(String[] args) {
        int discos; //numero de discos usados
        String disc;
        double NM; //Numero de Movimentos
        long TI, TF; // Tempo Inicial e Tempo Final. Contador de tempo
        Jogo Jogo = new Jogo();
        
        disc = JOptionPane.showInputDialog("Qual o numero de discos?: ");
        discos = Integer.parseInt(disc);
        NM = Math.pow(2, discos) -1 ; // Numero de movimentos
        
        TI = System.currentTimeMillis(); // Inicio da contagem do tempo
        Jogo.hanoi(discos, 1, 3, 2); // Execução do jogo Hanoi
        System.out.println("numero de jogadas...: " + NM);
        TF = System.currentTimeMillis(); // Final da contagem do tempo
        
        System.out.println((TF-TI)); // total tempo
    }
}
