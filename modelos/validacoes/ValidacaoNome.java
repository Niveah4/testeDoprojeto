package modelos.validacoes;

import modelos.exceptions.InvalidNomeFormatException;
public class ValidacaoNome {

    public static void validarNome(String nome) throws InvalidNomeFormatException{
            // Verifica se a entrada é uma string sem números
            if (!nome.matches ("[a-zA-Z\\s]+")) {
              throw new InvalidNomeFormatException ("Entrada inválida. Por favor, digite apenas letras e espaços.");
            } 
             if (!(nome == null || nome==" ")) {
            throw new InvalidNomeFormatException ("O nome não pode ser nulo ou vazio.");
        }
    }
    
}
