import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Calculadora calculadora = new Calculadora();

    public static void main(String[] args) {
        menuOperacoes();
    }

    public static void menuOperacoes() {
        System.out.println(
                "operações existentes:"
        		+ " \n|------------------|"
                + " \n| 1- Soma          |"
                + " \n| 2- Multiplicação |"
                + " \n| 3- Divisão       |"
                + " \n| 4- Subtração     |"
                + " \n| 5- Potenciação   |"
                + " \n| 6- Porcentagem   |"
                + " \n| 7- Raíz Quadrada |"
                + " \n|------------------|");
        int opcao = sc.nextInt();

        if (opcao < 1 || opcao > 7) {
            System.out.println("Tente novamente");
            menuOperacoes();
        } else {
            informarNumeros(opcao);
        }
    }

    public static void informarNumeros(int opcao) {
        double num1 = 0, num2 = 0;
        int qnt = 0;

        if (opcao == 1 || opcao == 2 || opcao == 4) {
            System.out.println("quantos números deseja usar? (1 a 5) ");
            qnt = sc.nextInt();

            if (qnt < 1 || qnt > 5) {
                System.out.println("Número inválidos!");
                informarNumeros(opcao);
            }
        }

        System.out.println("Informe um número: ");
        num1 = sc.nextDouble();

        if (opcao != 7) {
            System.out.println("Informe um número: ");
            num2 = sc.nextDouble();
        }

        switch (opcao) {
            case 1:
            	System.out.println(calculadora.somar(num1,num2));
                break;
            case 2:
            	System.out.println(calculadora.multiplicar(num1,num2));
                break;
            case 3:
                System.out.println(calculadora.divisao(num1, num2));
                break;
            case 4:
                System.out.println(calculadora.subtrair(num1, num2));
                break;
            case 5:
                System.out.println(calculadora.potenciacao(num1, num2));
                break;
            case 6:
                System.out.println(calculadora.porcentagem(num1, num2));
                break;
            case 7:
                System.out.println(calculadora.raiz(num1)); 
                break;
        }


        calculadora.voltar();
        menuOperacoes();
    }
}