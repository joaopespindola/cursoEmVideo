package com.mycompany.controleremoto;

public class ControleRemotoClasse implements Controlador{//"implements" para implementar a interface
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemotoClasse() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }
    
    

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Tá ligada essa brincadeira aí? "+this.isLigado());
        System.out.println("Tá tocando essa brincadeira aí? "+this.isTocando());
        System.out.println("Volume "+this.getVolume());//não esquece dos "this" panguão
        for(int i = 0; i < getVolume(); i+=5){
            System.out.print("|");
        }
        System.out.println("\nTá tocando? "+this.isTocando());
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu ");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado() == true){
            this.setVolume(this.getVolume() + 5);
        }else{
            System.out.println("Trem tá desligado");
        }
    }

    @Override
    public void menosVolume() {
        if(isLigado() == true){
            this.setVolume(this.getVolume() - 5);
        }else{
            System.out.println("Trem tá desligado");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && this.getVolume() > 0){
            setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() == true && this.isTocando() == false){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.isTocando() == true && this.isLigado() == true){
            this.setTocando(false);
        }
    }
       
}
