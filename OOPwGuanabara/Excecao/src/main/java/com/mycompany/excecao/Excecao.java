package com.mycompany.excecao;

public class Excecao {

    public static void main(String[] args) {
        try{
            int[] vetor = new int[4];
        
        System.out.println("Before Exception");
        
        vetor[4] = 1;
        
        System.out.println("Esse texto não será impresso");
            
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println("Erro ao acessar um indice do vetor q não existe");
        }
        System.out.println("Aqui será impresso");
    }
}
