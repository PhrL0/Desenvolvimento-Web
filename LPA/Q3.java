package LPA;

import java.util.Random;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int randomico = random.nextInt(30);
        int aux;
        System.out.println(randomico);
        while (true){
            System.out.print("Tente adivinhar o numero: ");
            aux = scan.nextInt();

           if(randomico != 0){
               if (aux > randomico){
                   System.out.println("========================");
                   System.out.println("Digite um valor Menor!!!");
                   System.out.println("========================");
               }
               else if (aux < randomico){
                   System.out.println("========================");
                   System.out.println("Digite um valor Maior!!!");
                   System.out.println("========================");
               }
               else {
                   System.out.println("Parabens voce acertou o numero");
                   break;
               }
           }
        }

        scan.close();





    }
}
