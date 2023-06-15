
public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //Métodos Construtores:

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
    // Construtor que inicializa o nome e a quantidade de funcionários, com salário base -1
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }
    
    //Métodos de acesso
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    //metodos
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return quantidadeFuncionarios * salarioBaseFuncionario;
    }

    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }
    
    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario="
                + salarioBaseFuncionario + "]";
    }

    
}
