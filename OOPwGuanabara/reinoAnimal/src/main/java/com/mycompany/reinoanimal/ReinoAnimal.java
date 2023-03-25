package com.mycompany.reinoanimal;

public class ReinoAnimal {

    public static void main(String[] args) {
        Mamífero vaca = new Mamífero(1000, 7, 4, "Mimosa");
        Reptil calanguinho = new Reptil(3, 21, 4, "Verde");
        Peixe Tucunaré = new Peixe("Preto, açu", 3.21, 2, 0);
        Canguru Jack = new Canguru(78, 12, 4, "Canguru Jack");
        Cachorro Bob = new Cachorro(10, 8, 4, "Bob");
        
        vaca.alimentar();
        vaca.emitirSom();
        vaca.locomover();
        calanguinho.locomover();
        Tucunaré.locomover();
        Jack.locomover();
        Jack.usarBolsa();
        Bob.emitirSom(8);
    }
}
