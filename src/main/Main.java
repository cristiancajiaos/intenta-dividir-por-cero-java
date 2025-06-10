package main;

import operaciones.Dividir;

public class Main {
    public static void main(String[] args) {
        Dividir divide = new Dividir();
        
        // Esto da un error
        divide.dividir(2, 0);
        
        // Esto no
        divide.dividir(6, 3);
    }
    
}
