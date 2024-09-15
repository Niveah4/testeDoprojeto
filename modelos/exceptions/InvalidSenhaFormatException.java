package modelos.exceptions;

public class InvalidSenhaFormatException extends Exception{


    public InvalidSenhaFormatException(){
        super();
    }

    public InvalidSenhaFormatException(String mensagem){
        super(mensagem);
    }
    
}
