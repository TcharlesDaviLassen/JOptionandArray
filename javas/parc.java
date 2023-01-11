package javas;

import java.util.Calendar;

import javax.swing.JOptionPane;

public class parc {

    // informações que serão resgatadas
    // private static final double VALOR_TOTAL = 1110.50;
    // private static final int NUMERO_PARCELAS = 12;
    // private static final double JUROS = 0.05; // 5%
    // private static final Calendar DATA_EMISSAO = Calendar.getInstance();

    public static void main(String[] args) {
        final Calendar data = Calendar.getInstance();

        // imprima o cabeçalho no início, caso te interesse

        String VALOR_TOTAL = JOptionPane.showInputDialog(null, "Qual é o valor do produto de compra", "");
        Double VALORTOTAL = Double.parseDouble(VALOR_TOTAL);

        String NUMERO_PARCELAS = JOptionPane.showInputDialog(null, "Digíte o número de parcelas", "");
        Integer NUMEROPARCELAS = Integer.parseInt(NUMERO_PARCELAS);

        String DATA_EMISSAO = JOptionPane.showInputDialog(null, "Qual é o dia do vencimento", "");
        Integer DIA_EMISSAO = Integer.parseInt(DATA_EMISSAO);
        Calendar DATAEMISSAO = null;
        DATAEMISSAO = data;
        DATAEMISSAO.add(Calendar.DAY_OF_MONTH, DIA_EMISSAO);
        
        double montante = VALORTOTAL;
        int montanteEmCentavos = (int) (montante * 100);
        int valorParcela = montanteEmCentavos / NUMEROPARCELAS;
        int parcela1 = montanteEmCentavos - valorParcela * (NUMEROPARCELAS - 1);

        imprimeInfo(1, NUMEROPARCELAS, parcela1, DATAEMISSAO);

        for (int i = 2; i <= NUMEROPARCELAS; i++) {

            DATAEMISSAO.add(Calendar.MONTH, 1);

            imprimeInfo(i, NUMEROPARCELAS, valorParcela, DATAEMISSAO);
        }
        System.out.printf("%nTotal do acerto: R$ %.2f%n", montante);
    }

    private static void imprimeInfo(int numeroParcela, int totalParcelas,int valorEmCentavos, Calendar data) {
        System.out.printf("%02d/%02d\t%td/%tm/%ty\tR$ %.2f%n", numeroParcela, totalParcelas, data, data, data,valorEmCentavos / 100.0);
    }

}
