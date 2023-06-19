package Classes;

/**
 *
 * @author Gabriel Santos Pereira
 */
public abstract class Pessoa {
    //Declaração dos Atributos
    protected int       id; 
    protected String    nome;
    protected String    RG;
    protected String    CPF;
    protected String    dataNascimento;
    protected String    telefone;
    
    //Declaração dos Métodos Construtores
    //inicialização de todos os atributos com valores default
    public Pessoa() {} 
    
    // inicialização recebendo todos os argumentos de acordo com os atributos
    public Pessoa(int id, String nome, String RG, String CPF, String dataNascimento, String telefone) { 
        this.id             = id;
        this.nome           = nome;
        this.RG             = RG;
        this.CPF            = CPF;
        this.dataNascimento = dataNascimento;
        this.telefone       = telefone;
    }

    //Declaração dos Métodos gets e sets
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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
