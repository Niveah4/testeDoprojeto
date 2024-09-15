package modelos.validacoes;

import modelos.exceptions.InvalidSenhaFormatException;

public class ValidacaoSenha {
  

    public static void validarSenha(String senha) throws InvalidSenhaFormatException{

        if (senha == null || senha.isEmpty()) {
            throw new InvalidSenhaFormatException ("A senha não pode ser nula ou vazia.");
        }
        if(senha.length() != 4){
            throw new InvalidSenhaFormatException("A senha deve possuir 4 dígitos numéricos.");
         }
         if (!senha.matches("\\d+")) { 
            throw new InvalidSenhaFormatException("A senha deve conter apenas números.");
        }
    }
}
