package com.mycompany.reinoanimal;

public class Canguru extends Mamífero{//logo, Canguru herda de mamífero, que por sua vez, herda de Animal
    
    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void locomover() {
        // NO AUTOMÁTICO ELE CHAMA O locomover()  da super
        System.out.println("Pulando");
    }
     
    public void usarBolsa(){
        System.out.println("Guardando trem na bolsa");
    }
    
}
