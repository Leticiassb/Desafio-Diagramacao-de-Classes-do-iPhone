package edu.dio.DesafioClassesIphone.loja;

import edu.dio.DesafioClassesIphone.dispositivos.Iphone;

public class Loja {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.adicionarNovaAba();
        iphone.atender();
        iphone.discar();
        iphone.avancarMusica();
        iphone.atualizarPagina();
        iphone.exibirPagina();
        iphone.iniciarCorreioDeVoz();
        iphone.reproduzirAleatorio();
        iphone.pausar();
        iphone.retrocederMusica();
        iphone.ligar();

    }
}
