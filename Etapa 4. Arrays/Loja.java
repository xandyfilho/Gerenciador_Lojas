import java.util.Arrays;

public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;
    //Métodos Construtores:

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int tamanhoEstoqueLoja) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoqueLoja];

    }
    
    // Construtor que inicializa o nome e a quantidade de funcionários, com salário base -1
    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco,
    Data dataFundacao, int tamanhoEstoqueLoja) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoqueLoja];
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
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public Data getDataFundacao() {
        return dataFundacao;
    }
    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
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
    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }
    
    public void imprimeProdutos() {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            Produto produto = estoqueProdutos[i];
            if (produto != null) {
            System.out.println(produto);
            }
        }
    }

    public boolean insereProduto(Produto novoProduto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] == null){
                    estoqueProdutos[i] = novoProduto;
                    return true; // Produto inserido com sucesso
                }
            }
        }
    return false; // Produto não inserido no estoque
}

    public boolean removeProduto(String nomeProduto){
        if(estoqueProdutos != null){
            for(int i = 0; i < estoqueProdutos.length; i++){
                if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)){
                    estoqueProdutos = null;
                    return true; // Produto removido com sucesso
                }
            }
        }
        return false; // Produto não encontrado no estoque
    }
    
    @Override
    public String toString() {
        return "----------Loja criada---------\nNome da loja = " + nome + 
        "\nQuantidade de funcionarios = " + quantidadeFuncionarios + 
        "\nSalario base dos funcionario = " + salarioBaseFuncionario+"\n" 
        + endereco + "\nData de fundação: "+dataFundacao+
        "\nTamanho da loja: "+tamanhoDaLoja()+
        "\nProdutos em estoque: "+  Arrays.toString(estoqueProdutos) ;
    }

}