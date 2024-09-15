package modelos.validacoes;

import modelos.exceptions.InvalidNomeFormatException;

public class ValidacaoMatricula {

    public static void validarMatricula(String matricula) throws InvalidNomeFormatException{
        if (matricula == null || matricula.isEmpty()) {
            throw new InvalidNomeFormatException ("A matrícula não pode ser nula ou vazia.");
        }
        if(matricula.length() != 6){
            throw new InvalidNomeFormatException("A senha deve possuir 6 dígitos numéricos.");
         }
         if (!matricula.matches("\\d+")) { 
            throw new InvalidNomeFormatException("A matrícula deve conter apenas números.");
        }
    }
    
}
