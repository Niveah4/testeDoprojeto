package modelos.Service;

import java.util.Scanner;

import modelos.Entidades.Admnistrador;
import modelos.Entidades.Leitor;
import modelos.exceptions.InvalidNomeFormatException;
import modelos.exceptions.InvalidSenhaFormatException;
import modelos.validacoes.ValidacaoMatricula;
import modelos.validacoes.ValidacaoSenha;

public class Cadastrar {

    public static Scanner scann = new Scanner(System.in);

    public static Leitor cadastrarLeitor(String nome) {
        String email = SolitcitarEmail.solicitarEmail();
        String cpf = SolicitaCpf.solicitarCpf();
        String senha = solicitarSenha();
        String matricula = solicitarMatricula();
        
        return new Leitor(nome, email, cpf, senha, matricula);
    }

    public static Admnistrador cadastrarAdministrador(String nome) {
        String email = SolitcitarEmail.solicitarEmail();
        String cpf = SolicitaCpf.solicitarCpf();
        String senha = solicitarSenha();
        String siape = solicitarSiape();
        
        return new Admnistrador(nome, email, cpf, senha, siape);
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
