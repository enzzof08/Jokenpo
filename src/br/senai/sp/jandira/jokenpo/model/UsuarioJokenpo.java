package br.senai.sp.jandira.jokenpo.model;

import java.util.Random;
import java.util.Scanner;

public class UsuarioJokenpo {
    int escolhaUsuario;
    int escolhaComputador;
    String NomeComputador;
    String NomeUsuario;
    String Resultado;

    public void ColetarDados(){
        Random random = new Random();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Faça sua Escolha:");
        System.out.println("(1)Papel, (2)Tesoura ou (3)Pedra");
        escolhaUsuario = leitor.nextInt();

        escolhaComputador = random.nextInt(3)+ 1;



        IdentificarNomeEscolha();



    }
    public void IdentificarNomeEscolha() {

        if (escolhaComputador == 1) {
            NomeComputador = "Papel";

        } else if (escolhaComputador == 2) {
            NomeComputador = "Tesoura";

        } else if (escolhaComputador == 3) {
            NomeComputador = "Pedra";

        }

        if (escolhaUsuario == 1) {
            NomeUsuario = "Papel";

        } else if (escolhaUsuario == 2) {
            NomeUsuario = "Tesoura";

        } else if (escolhaUsuario == 3) {
            NomeUsuario = "Pedra";

        }else {
            System.out.println("Escolha Inválida");
            return;
        }

        CalcularDados();
    }
    public void CalcularDados(){
        if (escolhaUsuario == 1 && escolhaComputador == 3){
            Resultado = "Você venceu";

        }else if(escolhaUsuario == 2 && escolhaComputador == 1){
            Resultado = "Você venceu";
        }else if (escolhaUsuario == 3 && escolhaComputador == 2) {
            Resultado = "Você venceu";
        }else if (escolhaUsuario == escolhaComputador){
            Resultado = "Você empatou";
        } else {
            Resultado = "Você perdeu";
        }

        ExibirDados();

    }
    public void ExibirDados(){
        System.out.println("Você escolheu: "+ NomeUsuario );
        System.out.println("E o computador: "+ NomeComputador);
        System.out.println("Então "+ Resultado);
        System.out.println("Quer tentar mais uma vez? (S/N)");
        Scanner leitor = new Scanner(System.in);
        String resposta = leitor.next();
        if (resposta.equalsIgnoreCase("s")) {
            ColetarDados();    } else {
            System.out.println("Jogo encerrado. Obrigado por jogar!");
        }
    }


}

