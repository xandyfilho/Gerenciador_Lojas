public class Informatica extends Loja {
    private double seguroEletronicos;
    
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, double seguroEletronicos, int estoqueProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, estoqueProdutos);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Loja Informartica [" 
        +"Nome da loja: "+ super.getNome()+
        "\nQuantidade de funcionarios: " + super.getQuantidadeFuncionarios()+
        "\nSalário base dos funcionários: " + super.getSalarioBaseFuncionario()+
        "\nEndereço: "+ super.getEndereco()+
        "\nData de fundação: "+ super.getDataFundacao()+
        "\nValor do seguro eletronico: " +getSeguroEletronicos()+"]";
    }
    
}
