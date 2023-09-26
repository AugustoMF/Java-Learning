/* 
* My first real java project! A lot to improve, but it's working fine
* An int calculator
*/

import java.util.Scanner;

public class calculator {
    public static void main (String[] args){

        boolean run = true;

        while (run) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Insira um número");

        int num1Calc = num1.nextInt();
       
        Scanner num2 = new Scanner(System.in);
        System.out.println("Insira o segundo número");
        
        int num2Calc = num2.nextInt();


        Scanner usr = new Scanner(System.in);
        System.out.println("Digite + para adição \nDigite - para subtração \nDigite x para multiplicação \nDigite / para divisão");

        String usrInput = usr.nextLine();

        if (usrInput.equals("+")){
            System.out.println("Seu resultado é: ");
            System.out.println( num1Calc + num2Calc);
        }
        else if (usrInput.equals("-")){
            System.out.println("Seu resultado é: ");
            System.out.println( num1Calc - num2Calc);
        }
        else if (usrInput.equals("x")){
            System.out.println("Seu resultado é: ");
            System.out.println( num1Calc * num2Calc);
        }
        else if (usrInput.equals("/")){
            System.out.println("Seu resultado é: ");
            System.out.println( num1Calc / num2Calc);
        }
        else{
            System.out.println("Operação inválida, insira seu operador novamente!50");
        }

        Scanner runAgain = new Scanner (System.in);
        System.out.println("Deseja Fazer outra conta? \nSe sim, digite sim, caso contrário digite qualquer outra coisa");

        String question = runAgain.nextLine();

        if (question.equals("sim")){
            System.out.println("Ok!");
        }
        else{
            System.out.println("Adeus!");
            run = false;
            num1.close();
            num2.close();
            usr.close();
            runAgain.close();
           }
        }
    }    
}
