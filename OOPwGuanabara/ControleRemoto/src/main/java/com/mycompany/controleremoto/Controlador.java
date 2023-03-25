package com.mycompany.controleremoto;

public interface Controlador {
    public abstract void ligar();//O "abstract" e o ";" definem que o método é abstrato
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
