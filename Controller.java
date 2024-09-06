package controller;

import util.Sala;
import util.Interruptor;
import util.Lampada;

public class Controller {
        public static void main(String[] args) {
        Lampada lampada1 = new Lampada("Lâmpada 1");
        Lampada lampada2 = new Lampada("Lâmpada 2");
        Lampada lampada3 = new Lampada("Lâmpada 3");
    
        Interruptor interruptor1 = new Interruptor("Interruptor 1");
        Interruptor interruptor2 = new Interruptor("Interruptor 2");
        Interruptor interruptor3 = new Interruptor("Interruptor 3");
    
        Sala sala1 = new Sala(lampada1, interruptor1);
        Sala sala2 = new Sala(lampada2, interruptor2);
        Sala sala3 = new Sala(lampada3, interruptor3);
    
        sala1.ligarInterruptor();
        sala1.desligarInterruptor();
        sala2.ligarInterruptor();
    
        System.out.println("Sala 1: " + (sala1.getLampada().isLigada() ? "Lâmpada ligada" : "Lâmpada desligada e quente"));
        System.out.println("Sala 2: " + (sala2.getLampada().isLigada() ? "Lâmpada ligada" : "Lâmpada desligada e fria"));
        System.out.println("Sala 3: " + (sala3.getLampada().isLigada() ? "Lâmpada ligada" : "Lâmpada desligada e fria"));
            
        sala2.desligarInterruptor();
        
        System.out.println("\nResultado Final:");
        System.out.println("Interruptor 1 controla: " + (sala1.getLampada().isLigada() ? "Lâmpada acesa" : "Lâmpada quente"));
        System.out.println("Interruptor 2 controla: " + (sala2.getLampada().isLigada() ? "Lâmpada acesa" : "Lâmpada fria"));
        System.out.println("Interruptor 3 controla: " + (sala3.getLampada().isLigada() ? "Lâmpada acesa" : "Lâmpada fria"));
    }
}
