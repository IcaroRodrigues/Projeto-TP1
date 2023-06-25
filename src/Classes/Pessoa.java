package Classes;

/**
* Classe abstrata que representa uma pessoa.
* Contém informações básicas de identificação e contato de uma pessoa.
* Contem apneas métodos concretos.
* 
* @author Gabriel Santos Pereira
*/
public abstract class Pessoa {
    // Declaração dos Atributos
    protected int       id; 
    protected String    nome;
    protected String    rg;
    protected String    cpf;
    protected String    dataNascimento;
    protected String    telefone;
    
    // Declaração dos Métodos Construtores
    // Inicialização de todos os atributos com valores default
    public Pessoa() {} 
    
    // Inicialização recebendo todos os argumentos de acordo com os atributos
    public Pessoa(int id, String nome, String rg, String cpf, String dataNascimento, String telefone) { 
        this.id             = id;
        this.nome           = nome;
        this.rg             = rg;
        this.cpf            = cpf;
        this.dataNascimento = dataNascimento;
        this.telefone       = telefone;
    }

    // Declaração dos Métodos gets e sets
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
