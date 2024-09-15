package modelos.exceptions;

 public class InvalidEmailFormatException extends Exception {

        public InvalidEmailFormatException (){
             super();
         }
     
         public InvalidEmailFormatException(String mensagem){
             super(mensagem);
         }
    
}
