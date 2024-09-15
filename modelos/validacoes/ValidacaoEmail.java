package modelos.validacoes;

import modelos.exceptions.InvalidEmailFormatException;

public class ValidacaoEmail {

    public static void validarEmail (String email) throws InvalidEmailFormatException {
      
        if ((!email.endsWith(".com")) && (!email.contains("@"))) {
            throw new InvalidEmailFormatException("Email inválido. Não possui '@' E não contém ao final '.com' "); 
        }else if (!email.endsWith(".com")) {
            throw new InvalidEmailFormatException("Email inválido. Não possui ao final '.com' "); 
        }else if(!email.contains("@")) {
            throw new InvalidEmailFormatException("Email inválido. Não possui '@'");     
        }  
    }
}
