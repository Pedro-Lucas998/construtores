public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereço(String endereço){
        this.endereco = endereco;
    }

    // Não tenho o set do nome e nem o cpf, por serem informaçoes mais relevantes
    // irei as atribuir pelo construtor


}
