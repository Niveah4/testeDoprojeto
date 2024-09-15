package modelos;

import modelos.interfaces.InterfaceLogin;

public class Admnistrador extends DadosUsuario implements InterfaceLogin{

    private String siape;
   
        public Admnistrador (String nome, String email, String cpf, String senha, String siape){
            super(nome, email, cpf, senha);
            this.siape = siape;
        }
        
        public String getSiape(){
            return siape;
        }

        public void setSiape(String siape){
            this.siape=siape;
        }
        
        @Override
        public boolean login(String siape, String senha) {
            return this.siape.equals(siape) && this.senha.equals(senha);
        }
}
