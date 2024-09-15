package modelos.Entidades;

import modelos.interfaces.InterfaceLogin;

public class Leitor extends Usuario implements InterfaceLogin{

        private String matricula;
       
            public Leitor (String nome, String email, String cpf, String senha, String matricula){
                super(nome, email, cpf, senha);
                this.matricula = matricula;
            }

            public String getMatricula(){
                return matricula;
            }
    
            public void setMatricula(String matricula){
                this.matricula=matricula;
            }
             @Override
            public boolean login (String matricula, String senha){
                return this.matricula.equals(matricula) && this.senha.equals(senha);
            }
            
}
