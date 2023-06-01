package array;

import java.util.Scanner;

public class NumeroMaior {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0;
int [] numeros = new int[5];
        System.out.println("defina um número: ");
        numeros[0] = sc.nextInt();

        System.out.println("agora, defina o próximo número: ");
numeros[1] = sc.nextInt();
        System.out.println("agora, defina o próximo número: ");
numeros[2] = sc.nextInt();
        System.out.println("agora, defina o próximo número: ");
numeros[3] = sc.nextInt();
        System.out.println("agora, defina o próximo número: ");
numeros[4] = sc.nextInt();
for (int i = 0; i < numeros.length; i++){
    if (numeros[i] > maior){
        maior = numeros[i];
    }
}
        System.out.println("o maior número é: " + maior);
    }

}
