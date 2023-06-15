public class Vestuario extends Loja {
    private boolean produtosImportados;
    
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, boolean produtosImportados, int tamanhoEstoqueLoja) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoqueLoja);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados() {
        return produtosImportados;
    }
    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return "Loja Vestuário [" 
        +"Nome da loja: "+ super.getNome()+
        "\nQuantidade de funcionarios: " + super.getQuantidadeFuncionarios()+
        "\nSalário base dos funcionários: " + super.getSalarioBaseFuncionario()+
        "\nEndereço: "+ super.getEndereco()+
        "\nData de fundação: "+ super.getDataFundacao()+
        "\nProdutos importados: " +getProdutosImportados()+"]";
    }
}
