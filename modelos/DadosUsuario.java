package modelos;

public abstract class DadosUsuario implements InterfaceUsuario{

    protected String nome;
    protected String email;
    protected String cpf;
    protected String senha;

        public DadosUsuario (String nome, String email, String cpf, String senha){
            this.nome=nome;
            this.email=email;
            this.cpf=cpf;
            this.senha=senha;
        }
        @Override
        public String getNome(){
            return nome;
        }

        public void setNome(String nome){
            this.nome=nome;
        }
        @Override
        public String getEmail(){
            return email;
        }

        public void setEmail(String email){
            this.email=email;
        }
        @Override 
        public String getSenha(){
            return senha;
        }

        public void setSenha(String senha){
            this.senha=senha;
        }
        @Override
        public String getCpf(){
            return cpf;
        }

        public void setCpf(String cpf){
            this.cpf=cpf;
        }

    
}
