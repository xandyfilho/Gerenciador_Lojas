
public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Construtor
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Definindo a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validarData(dia, this.mes, this.ano)) {
            this.dia = dia;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o dia.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validarData(this.dia, mes, this.ano)) {
            this.mes = mes;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o mês.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validarData(this.dia, this.mes, ano)) {
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Não foi possível alterar o ano.");
        }
    }

    //metodos
    public boolean verificaAnoBissexto() {
        if (ano % 400 == 0) {
            return true;
        } else if (ano % 100 == 0) {
            return false;
        } else if (ano % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validarData(int dia, int mes, int ano) {
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }

        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (verificaAnoBissexto() && mes == 2) {
            diasPorMes[1] = 29;
        }

        if (dia > diasPorMes[mes - 1]) {
            return false;
        }

        return true;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}