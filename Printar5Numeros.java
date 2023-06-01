package array;

import java.util.Scanner;

public class Printar5Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pegaNumero = 0;
        int[] printes = new int[5];
   for (int i = 0; i < printes.length; i++){
       System.out.println("defina o número a ser exibido: ");
       int getNumber = sc.nextInt();
       int recebe = getNumber;
       System.out.println(recebe);
   }
   sc.close();

    }

}


