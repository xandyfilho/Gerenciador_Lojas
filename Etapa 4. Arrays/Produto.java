
public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

 //Construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }  
    
    //metodos de acesso
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Data getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }
    //Metodo
    public boolean estaVencido(Data dataAtual) {
        if (this.dataValidade == null) {
            return false;
        }
        if (this.dataValidade.getAno() < dataAtual.getAno()) {
            return true;
        } else if (this.dataValidade.getAno() == dataAtual.getAno()) {
            if (this.dataValidade.getMes() < dataAtual.getMes()) {
                    return true;
                } else if (this.dataValidade.getMes() == dataAtual.getMes()) {
                    if (this.dataValidade.getDia() < dataAtual.getDia()) {
                        return true;
                    }
                }
        }
    
            return false;
    }
    
    @Override
    public String toString() {
        return "-------Produto-------- \nnome do Produto: " + nome + 
        "\nPreço do produto: R$" + preco +
        "\nData de validade: "+ dataValidade;
    }
}
