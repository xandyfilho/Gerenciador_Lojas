public class Alimentacao extends Loja {
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, Data dataAlvara, int tamanhoEstoqueLoja) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoqueLoja);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }
    @Override
    public String toString() {
        return "Alimentação [" 
        +"Nome da loja: "+ super.getNome()+
        "\nQuantidade de funcionarios: " + super.getQuantidadeFuncionarios()+
        "\nSalário base dos funcionários: " + super.getSalarioBaseFuncionario()+
        "\nEndereço: "+ super.getEndereco()+
        "\nData de fundação: "+ super.getDataFundacao()+
        "\nData do alvara: " +getDataAlvara()+"]";
    }
}
