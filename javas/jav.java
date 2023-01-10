package javas;

import java.util.ArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class jav {
    public static void main(String[] args) {

        // int[][] array1 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // int[][] array2 = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

        // System.out.println("Valores no array1 passados na linha são");
        // outputArray(array1); // exibe o array 2 por linha

        // System.out.println("Valores no array2 passados na linha são");
        // outputArray(array2); // exibe o array 2 por linha

        String produtoDeCompra = JOptionPane.showInputDialog(null, "Qual é o valor do produto de compra", "");
        String parcela = JOptionPane.showInputDialog(null, "Digite a quantidade de parcelas", "");

        int vl = Integer.parseInt(parcela);
        int parc[] = new int[vl + 1];

        int prod = Integer.parseInt(produtoDeCompra);

        int prodVal = prod / vl;

        BigDecimal total = BigDecimal.ZERO;

        for (int i = 1; i < parc.length; i++) {
            if (total == BigDecimal.ZERO) {
                System.out.println("Numero correto e aredondado em parcelas");

                System.out.println("Parcela nº " + i + " no valor de " + arredondar(prodVal + 1));

                System.out.println("total compra => " + prodVal * vl);
            }
        }

        // for (int i = 1; i < parc.length; i++) {

        // System.out.println("Parcela nº " + i + " no valor de " +
        // arredondar(prodVal));

        // }

    }

    private static String arredondar(double media) {
        DecimalFormat df = new DecimalFormat("0.00");

        df.setRoundingMode(RoundingMode.HALF_UP);

        // System.out.println("valoForm =>" + df.format(media));

        return df.format(media);

    }

    private static BigDecimal formatVal(double media) {
        BigDecimal bd = new BigDecimal(media).setScale(2, RoundingMode.HALF_UP);

        System.out.println(bd);

        return bd;

    }

    // public static void outputArray(int[][] array) {
    // // FAZ UM LOOP PELAS LINHAS DO ARRAY
    // for (int linha = 0; linha < array.length; linha++) {
    // // FAZ LOOP PELAS COLUNAS DA LINHA ATUAL
    // for (int coluna = 0; coluna < array[linha].length; coluna++)
    // System.out.printf("%d ", array[linha][coluna]);
    // System.out.println();
    // }
    // }

}