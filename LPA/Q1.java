package LPA;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num,aux = 0;

        do {
            System.out.print("Digite um número positivo:");
            num = scan.nextInt();

            if(num <= 0){
                System.out.println("A soma dos números digitados é: " + aux);
                break;
            } else {
                aux = num + aux;
            }
        } while(true);



        scan.close();
    }
}
