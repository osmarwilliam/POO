package entities;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Boolean dataValida() {
        if (this.mes < 1 || this.mes > 12) {
            System.out.println("Mes inválido");
            return false;
        }
        Boolean verificacaoDia = verificarDia(this.mes, this.dia);
        if (!verificacaoDia) {
            System.out.println("Dia inválido");
            return false;
        }

        return true;
    }

    public int getDia() {
        return this.dia;
    }

    public int getMes() {
        return this.mes;
    }

    public int getAno() {
        return this.ano;
    }

    public Boolean anoBissexto() {
        if (
            ((this.ano % 4 == 0) && (this.ano % 100 != 0)) ||
            (this.ano % 400 == 0)
        ) {
            return true;
        }
        return false;
    }

    public void imprimir(String operador) {
        if (dataValida()) {
            if (operador != null) {
                System.out.println(
                    this.getDia() +
                        operador +
                        this.getMes() +
                        operador +
                        this.getAno()
                );
            } else {
                System.out.println(
                    this.getDia() + "/" + this.getMes() + "/" + this.getAno()
                );
            }
        } else {
            System.out.println("Data Inválida!!");
        }
    }

    public boolean verificarDia(int mes, int dia) {
        int maxDiaMes = 31;

        if (mes == 1) {
            maxDiaMes = 31;
        } else if (mes == 2) {
            maxDiaMes = 28;
            if (anoBissexto()) {
                maxDiaMes = 29;
            }
        } else if (mes == 3) {
            maxDiaMes = 31;
        } else if (mes == 4) {
            maxDiaMes = 30;
        } else if (mes == 5) {
            maxDiaMes = 31;
        } else if (mes == 6) {
            maxDiaMes = 30;
        } else if (mes == 7) {
            maxDiaMes = 31;
        } else if (mes == 8) {
            maxDiaMes = 31;
        } else if (mes == 9) {
            maxDiaMes = 30;
        } else if (mes == 10) {
            maxDiaMes = 31;
        } else if (mes == 11) {
            maxDiaMes = 30;
        } else {
            maxDiaMes = 31;
        }

        if (dia < 1 || dia > maxDiaMes) {
            return false;
        }
        return true;
    }
}
