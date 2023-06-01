package array;

import java.util.Scanner;

public class NumeroIntervalo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o primeiro número para o intervalo: ");
        int intervalo1 = sc.nextInt();
        System.out.println("agora, digite o número do intervalo limite: ");
   int intervaloL = sc.nextInt();
   if (intervalo1 > intervaloL){
       System.out.println("número inválido, só funciona número do menor para o maior.");
   }
   int [] intervalos = new int[intervaloL];

   for (int i = intervalo1; i < intervalos.length; i++){


       System.out.println(i);
   }
   sc.close();
    }

}
