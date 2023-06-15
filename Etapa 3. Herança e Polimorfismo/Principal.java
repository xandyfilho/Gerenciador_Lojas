
public class Principal {
    
    public static void main(String[] args) {
        
        //Inicializando variaveis vazias
        Loja loja = null;
        Produto produto = null;

        int opcao = 0;
        do{
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar uma Produto");
        System.out.println("(3) sair");

        opcao = Teclado.leInt("Escolha uma opção:");

        switch (opcao) {
            case 1:
                loja = criarLoja();
                break;

            case 2:
                produto = criarProduto();
                break;
            
            case 3:
                System.out.println("Saíndo do sistema...");
                break;

            default:
                System.out.println("Opção inválida");
                break;
            }
        } while (opcao != 3);

        // Verificar se o produto está vencido
       

        System.out.println(loja.toString());
    }
    public static Loja criarLoja() {
        //Parametros loja
        String nomeLoja = Teclado.leString("Digite o nome da sua loja:");
        int quantidadeFuncionarios = Teclado.leInt("Quantidade de funcionário:");
        double salarioBaseFuncionario = Teclado.leDouble("Salário base dos funcionarios:");
        //Endereco loja
        String nomeDaRua = Teclado.leString("Digite o rua onde fica a loja:");
        String cidade = Teclado.leString("Digite a cidade:");
        String estado = Teclado.leString("Digite o estado:");
        String pais = Teclado.leString("Digite o país:");
        String cep  = Teclado.leString("Digite o CEP:");
        String numero = Teclado.leString("Digite o número:");
        String complemento = Teclado.leString("Digite o complemento:");
        
        //Data Fundação da loja
        int diaFundacaoLoja = Teclado.leInt("Digite o dia de fundação da loja: ");
        int mesFundacaoLoja = Teclado.leInt("Digite o mês de fundação da loja: ");
        int anoFundacaoLoja = Teclado.leInt("Digite o ano de fundação da loja: ");

        Endereco enderecoLoja = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
        Data dataFundacao = new Data(diaFundacaoLoja, mesFundacaoLoja, anoFundacaoLoja);

        
        Loja lojaCriada = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, enderecoLoja, dataFundacao);


        System.out.println(lojaCriada);
        return lojaCriada;
        
    }


    public static Produto criarProduto() {
         //Parametros Produto
         String nomeProduto = Teclado.leString("Digite o nome do Produto:");
         double produtoPreco = Teclado.leDouble("Qual o preço do produto:");
         //data Produto
         int diaValidade = Teclado.leInt("Dia da validade do produto:");
         int mesValidade = Teclado.leInt("Mês de validade do produto:");
         int anoValidade = Teclado.leInt("Ano de validade do produto:");
         
         Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
         // Criar instância de Produto
         Produto novoProduto = new Produto(nomeProduto, produtoPreco, dataValidade);
        
         if (novoProduto != null) {
            Data dataConsulta = new Data(20, 10, 2023);
            if (novoProduto.estaVencido(dataConsulta)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }           
        }
        System.out.println(novoProduto);
        return novoProduto;
    }
}

