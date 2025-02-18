package fernando.qa.comjava.introducao;

public class Aula04Operadores {
    public static void main (String[] args){
//operadores aritimeticos
        int   somaNumber1 = 50;
        int  somaNumber2 = 100;
        int  somaResult = somaNumber2 + somaNumber1;

        int divNumber1 = 654;
        double divNumber2 = 321;
        double resDiv = divNumber1 / divNumber2;

        int multNumber1 = 800;
        double multNumber2 = 200;
        double multRes = multNumber1 * multNumber2;


        System.out.println("Resultado da soma: "+somaResult+ " Resultado da divisão: " + resDiv +  " Resultado da multiplicação: " + multRes);

 // operadores relacionais
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezDiferenteVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezIgualVinte: " + isDezIgualVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezDiferenteVinte: " + isDezDiferenteVinte);

 // operadores logicos && (and)
        double tempoEmpresa = 1.5;
        double salario = 1000;

        boolean receberAumentoDeSalario = tempoEmpresa > 1 && salario < 1600;

        System.out.println("Direito a receber aumento: " + receberAumentoDeSalario);

// operadores logicos || (or)

        double cartaoDebito = 89.63;
        double cartaoCredito = 5000;
        int produto = 10000;

        boolean isCompraEfetuada = cartaoDebito > produto || cartaoCredito > produto;

        System.out.println("Compra efetuada? " + isCompraEfetuada);

    }
}
