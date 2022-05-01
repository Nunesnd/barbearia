/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Models.Cliente;
import Models.Servicos;

/**
 *
 * @author nunes
 */
public class Main {
    public static void main (String[] args){
        Servicos barba = new Servicos(1, "barba", 30);
        
        Cliente crient = new Cliente(1, "Tião", 'M', "234567890", "Rua tupi");
        
        System.out.println(crient.getNome());
        System.out.println(barba.getDescricao());
    }
}
