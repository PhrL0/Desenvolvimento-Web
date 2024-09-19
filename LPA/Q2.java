package LPA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        int aux;
        do {
            System.out.print("Digite um número: ");
             lista.add(scan.nextInt());

             Collections.sort(lista);

             if (lista.contains(0)){
                 for (Integer i : lista){
                     if (i < 0){
                         System.out.println(lista.getFirst());
                     }
                     else{
                         System.out.println(lista.get(1));
                     }
                     break;
                 }
                 break;
             }
        } while(true);
    }
}
