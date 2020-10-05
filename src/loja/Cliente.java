package loja;

public class Cliente {
    private String nome;
    private String email;
    private String senha;
    private String sexo;
    private int numero;
    private String endereco;
    private String cep;
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + 
                ", \nemail=" + email + 
                ", \nsenha=" + senha + 
                ", \nsexo=" + sexo + 
                ", \nnumero=" + numero + 
                ", \nendereco=" + endereco + 
                ", \ncep=" + cep + '}';
    }
    
    
}
