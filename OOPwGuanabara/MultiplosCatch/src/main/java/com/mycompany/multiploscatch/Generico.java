package com.mycompany.multiploscatch;

public class Generico {

    public static void main(String[] args) {
        int[] numeros = {4,8,16,32,64,128};//com as chaves eu posso inicializar
        //o vetor sem precisar do "new"
        int[] demon = {2,0,4,8,0};
        
        for(int i = 0; i < numeros.length; i++){
            try{
            System.out.println(numeros[i] + "/" + demon[i] + "=" + (numeros[i]/demon[i]));
            }
            catch(Throwable exception){//tipo da exception exception
               System.out.println("Erro");
            }

        }
    }
}
