package modelos.Service;

import modelos.exceptions.InvalidEmailFormatException;
import modelos.validacoes.ValidacaoEmail;

import java.util.Scanner;

public class SolitcitarEmail {

    private static Scanner sc = new Scanner(System.in);

    public static String solicitarEmail() {
        String email;
        while (true) {
            System.out.println("Digite seu email:");
            email = sc.nextLine();
            try {
                ValidacaoEmail.validarEmail(email);
                System.out.println("Email válido.");
                break;
            } catch (InvalidEmailFormatException e) {
                System.out.println("Email inválido: " + e.getMessage());
                System.out.println("Insira seu email novamente.");
            }
        }
        return email;
    }

}
