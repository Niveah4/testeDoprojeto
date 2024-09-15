package modelos.UI;

import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;
import modelos.Service.Cadastrar;
import modelos.SolicitacaoNome;

import java.util.Scanner;

public class RealizarCadastro {
    private static Scanner scann = new Scanner(System.in);

    public static void realizarCadastro() {

        System.out.println("Bem-vindo ao sistema de cadastro!");
        String nome = SolicitacaoNome.solicitarNome();

        System.out.println("Escolha o tipo de usuário:");
        System.out.println("1 - Leitor");
        System.out.println("2 - Administrador");
        int opcao = scann.nextInt();
        scann.nextLine();

        if (opcao == 1) {
            Leitor leitor = Cadastrar.cadastrarLeitor(nome);
            leitores.put(leitor.getMatricula(), leitor); // Armazenar leitor no mapa
            System.out.println("\nLeitor cadastrado com sucesso!");
            System.out.println("Nome: " + leitor.getNome());
            System.out.println("Email: " + leitor.getEmail());
            System.out.println("Matrícula: " + leitor.getMatricula());

        } else if (opcao == 2) {
            Admnistrador admin = Cadastrar.cadastrarAdministrador(nome);
            administradores.put(admin.getSiape(), admin); // Armazenar administrador no mapa
            System.out.println("\nAdministrador cadastrado com sucesso!");
            System.out.println("Nome: " + admin.getNome());
            System.out.println("Email: " + admin.getEmail());
            System.out.println("SIAPE: " + admin.getSiape());

        } else {
            System.out.println("Opção inválida!");
        }
    }

}
