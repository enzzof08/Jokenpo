package br.senai.sp.jandira.jokenpo;

import br.senai.sp.jandira.jokenpo.model.UsuarioJokenpo;

import java.util.Random;
import java.util.Scanner;

public class jokenpoApp {
    public static void main(String[] args) {

        System.out.println("Iniciando Jogo");
        UsuarioJokenpo jokenpo = new UsuarioJokenpo();
        jokenpo.ColetarDados();

    }
}

