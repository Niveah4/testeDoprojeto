package modelos;

import java.util.Scanner;

import modelos.exceptions.InvalidCpfFormat;
import modelos.exceptions.InvalidEmailFormatException;
import modelos.exceptions.InvalidNomeFormatException;
import modelos.exceptions.InvalidSenhaFormatException;
import modelos.validacoes.ValidacaoEmail;
import modelos.validacoes.ValidacaoMatricula;
import modelos.validacoes.ValidacaoSenha;
import modelos.validacoes.ValidacaoCpf;

public class Cadastrar {

    public static Scanner scann = new Scanner(System.in);

    public static Leitor cadastrarLeitor(String nome) {
        String email = solicitarEmail();
        String cpf = solicitarCpf();
        String senha = solicitarSenha();
        String matricula = solicitarMatricula();
        
        return new Leitor(nome, email, cpf, senha, matricula);
    }

    public static Admnistrador cadastrarAdministrador(String nome) {
        String email = solicitarEmail();
        String cpf = solicitarCpf();
        String senha = solicitarSenha();
        String siape = solicitarSiape();
        
        return new Admnistrador(nome, email, cpf, senha, siape);
    }

    private static String solicitarEmail() {
        String email;
        while (true) {
            System.out.println("Digite seu email:");
            email = scann.nextLine();
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

    private static String solicitarCpf() {
        String cpf;
            while (true) {
               System.out.println("Digite seu CPF:");
               cpf = scann.nextLine();
                try{
                    ValidacaoCpf.validarCpf(cpf);
                    System.out.println("CPF válido!");
                    break;
                }catch(InvalidCpfFormat e){
                    System.out.println(e.getMessage());
                }
            }
        return cpf;
    }

    private static String solicitarSenha() {
        String senha;
            while(true){
                System.out.println("Digite sua senha:");
                senha= scann.nextLine();
                try{
                    ValidacaoSenha.validarSenha(senha);
                    System.out.println("Senha válida!");
                    break;
                }catch(InvalidSenhaFormatException e){
                      System.out.println("Senha inválida: " + e.getMessage());
                }
           }
        return senha;
    }

    private static String solicitarMatricula() {
        String matricula;
        while(true){
            System.out.println("Digite sua matricula:");
            matricula= scann.nextLine();
            try{
                ValidacaoMatricula.validarMatricula(matricula);
                System.out.println("Matricula válida!");
                break;
            }catch(InvalidNomeFormatException e){
                  System.out.println("Matricula inválida: " + e.getMessage());
            }
       }
                return matricula;
    }

    private static String solicitarSiape() {
        System.out.println("Digite seu SIAPE:");
        return scann.nextLine();
    }
}
