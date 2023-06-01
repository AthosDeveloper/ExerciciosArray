package array;

import java.util.Scanner;

public class PrecoProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double produto1 = 0.0;
        double produto2 = 0.0;
        double produto3 = 0.0;
        double produto4 = 0.0;


        double[] produtos = new double[4];
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Insira o valor do produto: ");
            produtos[i] = sc.nextDouble();
            produto1 = produtos[0];
            produto2 = produtos[1];
            produto3 = produtos[3];
            produto4 = produtos[4];
        }
            if (produto1 < produto2 && produto1 < produto3 && produto1 < produto4) {

                System.out.println("o produto de valor " + produto1 + " é o mais barato.");
            } else if (produto2 < produto1 && produto2 < produto3 && produto2 < produto4) {
                System.out.println("o segundo valor de número " + produto2 + " é o mais barato.");
            } else if (produto3 < produto4) {
                System.out.println("o terceiro valor de número " + produto3 + " é o mais barato ");
            } else {
                System.out.println("o quarto produto de valor " + produto4 + " é o mais barato.");
            }
        }


    }
