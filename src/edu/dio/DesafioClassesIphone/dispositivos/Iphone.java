package edu.dio.DesafioClassesIphone.dispositivos;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("MÚSICA TOCANDO");

    }

    @Override
    public void pausar() {
        System.out.println("MÚSICA PAUSADA");
    }

    @Override
    public void avancarMusica() {
        System.out.println("PRÓXIMA MÚSICA");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("MÚSICA ANTERIOR");

    }

    @Override
    public void reproduzirAleatorio() {
        System.out.println("REPRODUZINDO MÚSICAS NO MODO ALEATÓRIO");

    }

    @Override
    public void ligar() {
        System.out.println("FAZENDO CHAMADA");

    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO CHAMADA");

    }

    @Override
    public void discar() {
        System.out.println("DISCANDO NÚMERO");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("SUAS MENSAGENS DE VOZ SÃO...");

    }

    @Override
    public void exibirPagina() {
        System.out.println("PÁGINA DA WEB");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("NOVA PÁGINA DA WEB");


    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA DA WEB");

    }
}
