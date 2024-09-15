package modelos;

import modelos.exceptions.InvalidNomeFormatException;
import modelos.validacoes.ValidacaoNome;
import java.util.Scanner;

public class SolicitacaoNome {
    public static Scanner scann = new Scanner(System.in);

    public static String solicitarNome() {
        String nome;

        while (true) {
            System.out.println("Digite seu nome:");
            nome = scann.nextLine();

            try {
                ValidacaoNome.validarNome(nome);
                break;
            } catch (InvalidNomeFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return nome;
    }
}
