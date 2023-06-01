package array;

import java.util.Scanner;

public class DiaSemana {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer pegaDia;

        String[] dias = {"domingo", "segunda", "terça", "quarta", "quinta", "sesta", "sábado"};
        System.out.println("digite um número de 0 a 6");
        pegaDia = sc.nextInt();
        if (pegaDia.equals(0)) {
            System.out.println(dias[0]);
        } else if (pegaDia.equals(1)) {
            System.out.println(dias[1]);
        } else if (pegaDia.equals(2)) {
            System.out.println(dias[2]);
        } else if (pegaDia.equals(3)) {
            System.out.println(dias[3]);
        } else if (pegaDia.equals(4)) {
            System.out.println(dias[4]);
        } else if (pegaDia.equals(5)) {
            System.out.println(dias[5]);

            if (pegaDia.equals(6)) {
                System.out.println(dias[6]);

            }
sc.close();

        }






}
}

