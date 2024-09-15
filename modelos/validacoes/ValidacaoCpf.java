package modelos.validacoes;

import modelos.exceptions.InvalidCpfFormat;

public class ValidacaoCpf {

    public static void validarCpf (String cpf) throws InvalidCpfFormat{

        if (!(cpf.length() == 11)) {
           throw new InvalidCpfFormat ("CPF não contém 11 dígitos. Tente Novamente");
        } else if (cpf.isEmpty()) {
            System.out.println("Campo CPF está vazio.");
        }
       
    }
    
}
