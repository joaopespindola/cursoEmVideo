package com.mycompany.reinoanimal;

public class Ave extends Animal{
    private String corPena;
    
    //construtor sempre publico e com o mesmo nome da Classe
    public Ave(double peso, int idade, int membros, String corPena){
        //chamando o construtor da classe mãe
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    
    public void setCorPena(String corPena){
        this.corPena = corPena;
    }
    public String getCorPena(){
        return this.corPena;
    } 

    @Override
    public void locomover() {
        System.out.println("Avoa");
    }

    @Override
    public void alimentar() {
        System.out.println("Pruuuuuu");
    }

    @Override
    public void emitirSom() {
        System.out.println("Pedreiro de ninho");
    }
    
    
}
