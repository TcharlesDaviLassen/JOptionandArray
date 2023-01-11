package javas;

import java.util.Calendar;

public class parc {

    // informações que serão resgatadas
    private static final double VALOR_TOTAL = 1110.50;
    private static final int NUMERO_PARCELAS = 12;
    private static final double JUROS = 0.05; // 5%
    private static final Calendar DATA_EMISSAO = Calendar.getInstance();

    public static void main(String[] args) {

        // imprima o cabeçalho no início, caso te interesse
        double montante = VALOR_TOTAL;
        int montanteEmCentavos = (int) (montante * 100);
        int valorParcela = montanteEmCentavos / NUMERO_PARCELAS;
        int parcela1 = montanteEmCentavos - valorParcela
                * (NUMERO_PARCELAS - 1);

        imprimeInfo(1, NUMERO_PARCELAS, parcela1, DATA_EMISSAO);
        for (int i = 2; i <= NUMERO_PARCELAS; i++) {

            DATA_EMISSAO.add(Calendar.MONTH, 1);
           
            imprimeInfo(i, NUMERO_PARCELAS, valorParcela, DATA_EMISSAO);
        }
        System.out.printf("%nTotal do acerto: R$ %.2f%n", montante);
    }

    private static void imprimeInfo(int numeroParcela, int totalParcelas,
            int valorEmCentavos, Calendar data) {
        System.out.printf("%02d/%02d\t%td/%tm/%ty\tR$ %.2f%n", numeroParcela,
                totalParcelas, data, data, data, valorEmCentavos / 100.0);
    }

}
