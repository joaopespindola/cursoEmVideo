package com.mycompany.reinoanimal;

public class Cachorro extends Mamífero{

    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    


    
    public void emitirSom(boolean éODono) {
        if(éODono == true){
            System.out.println("Rola e abana o rabo");
        }else{
            System.out.println("Rosna");
        }
    }
    //na sobrecarga, você passará parâmetros diferentes e terá resultados diferentes, 2 métodos não podem ter a mesma assinatura na mesma classe ao fazer a sobrecarga
    public void emitirSom(int idade) {
        if(idade < 8){
            System.out.println("Rola e abana o rabo");
        }else{
            System.out.println("pô, tô velhin :(");
        }
    }
    
    
}
