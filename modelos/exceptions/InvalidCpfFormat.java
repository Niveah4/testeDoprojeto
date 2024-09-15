package modelos.exceptions;

public class InvalidCpfFormat extends Exception{

    public InvalidCpfFormat(){
        super();
    }

    public InvalidCpfFormat(String mensagem){
        super(mensagem);
    }

    
}
