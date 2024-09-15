package modelos.Service;

import modelos.exceptions.InvalidCpfFormat;
import modelos.validacoes.ValidacaoCpf;

import java.util.Scanner;

public class SolicitaCpf {

    private static Scanner sc = new Scanner(System.in);

    public static String solicitarCpf() {
        String cpf;
        while (true) {
            System.out.println("Digite seu CPF:");
            cpf = sc.nextLine();
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
}
