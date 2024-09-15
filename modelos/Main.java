package modelos;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Scanner scann = new Scanner(System.in);
    // Armazenar usuários para simular um banco de dados
    public static Map<String, Leitor> leitores = new HashMap<>();
    public static Map<String, Admnistrador> administradores = new HashMap<>();

    public static void main(String[] args) {

        while (true) {  
            System.out.println("Bem-vindo à Bibliotech!");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Cadastro");
            System.out.println("2 - Login");
            System.out.println("3 - Sair");

            int opcEntrada = scann.nextInt();
            scann.nextLine(); 

            switch (opcEntrada) {
                case 1:
                    realizarCadastro();  
                    break;
                case 2:
                    realizarLogin();  
                    break;
                case 3:
                    System.out.println("Saindo do sistema... Até logo!");
                    return;  
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

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

    public static void realizarLogin() {
        // Verificar se há leitores ou administradores cadastrados
        if (leitores.isEmpty() && administradores.isEmpty()) {
            System.out.println("\nNenhum usuário cadastrado. Por favor, realize o cadastro primeiro.");
            return;  // Volta ao menu principal
        }

        System.out.println("Bem-vindo ao sistema de login!");
        System.out.println("Digite o tipo de usuário:");
        System.out.println("1 - Leitor");
        System.out.println("2 - Administrador");
        int tipoUsuario = scann.nextInt();
        scann.nextLine(); // Limpa o buffer do scanner

        if (tipoUsuario == 1) {
            if (leitores.isEmpty()) {
                System.out.println("\nNenhum Leitor cadastrado. Realize o cadastro primeiro.");
                return;  // Volta ao menu principal
            }

            System.out.println("Digite número da matrícula:");
            String matricula = scann.nextLine();
            System.out.println("Digite sua senha:");
            String senha = scann.nextLine();

            Leitor leitor = leitores.get(matricula); // Buscar no mapa de leitores

            if (leitor != null && leitor.login(matricula, senha)) {
                System.out.println("\nLogin bem-sucedido como Leitor!");
            } else {
                System.out.println("\nMatrícula ou senha inválidos para Leitor.");
            }

        } else if (tipoUsuario == 2) {
            if (administradores.isEmpty()) {
                System.out.println("Nenhum Administrador cadastrado. Realize o cadastro primeiro.");
                return;  // Volta ao menu principal
            }

            System.out.println("Digite número do SIAPE:");
            String siape = scann.nextLine();
            System.out.println("Digite sua senha:");
            String senha = scann.nextLine();

            Admnistrador administrador = administradores.get(siape); // Buscar no mapa de administradores

            if (administrador != null && administrador.login(siape, senha)) {
                System.out.println("\nLogin bem-sucedido como Administrador!");
            } else {
                System.out.println("Identificador ou senha inválidos para Administrador.");
            }
        } else {
            System.out.println("Tipo de usuário não identificado.");
        }
    }
}
