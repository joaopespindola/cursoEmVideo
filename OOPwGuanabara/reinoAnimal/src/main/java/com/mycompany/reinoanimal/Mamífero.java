package com.mycompany.reinoanimal;

//extends para herdar as características de animal
public class Mamífero extends Animal{
    
    private String corPelo;

    public Mamífero(double peso, int idade, int membros, String corPelo){
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }
    
    //@Override para indicar que está sendo sobreposto ao método da Super
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando?");
    }

    @Override
    public void emitirSom() {
        System.out.println("Barui de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
}
