
import java.util.Scanner;

public class Calculadora {
    public static  void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        //Elementos= numero1 e numero2
        System.out.println("===CALCULADORA===");

        System.out.print("Digite o primeiro número:");
        double numero1 = teclado.nextDouble();

        System.out.print("Digite o segundo número:");
        double numero2 = teclado.nextDouble();
        //Calculos
        double soma = numero1 + numero2;

        double subtracao = numero1 - numero2;

        double multiplicacao = numero1 * numero2;

        double divisao = numero1 / numero2;

        System.out.println("\n📔FRAÇÃO");
        System.out.println(numero1+"/"+numero2);

        double porcentagem = (numero1*numero2)/100;

        double decimal = numero1 / 10;
        //Local onde pegar os elementos, soma, subtracao... que da no Calculo
        System.out.println("\n➕Soma:" + soma);

        System.out.println("➖Subtração:"+ subtracao);

        System.out.println("✖Multiplicação:" + multiplicacao);

        System.out.println("➗Divisão:"+ divisao);

        System.out.println("Número decimal:"+ decimal);

        System.out.println("Porcentagem:"+ porcentagem );

        teclado.close();

    }
}
