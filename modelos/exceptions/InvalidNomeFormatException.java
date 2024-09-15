package modelos.exceptions;

public class InvalidNomeFormatException extends Exception {
    
    public InvalidNomeFormatException(){
        super();
    }
    public InvalidNomeFormatException(String mensagem){
        super(mensagem);
    }

}
