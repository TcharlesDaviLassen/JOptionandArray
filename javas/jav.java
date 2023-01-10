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

        double prod = Double.parseDouble(produtoDeCompra);
        System.out.println(prod);

        double prodVal = prod / vl;
        System.out.println("prov =>" + prodVal);

        if (prodVal % 2 == 0) {

            System.out.println("Numero correto e aredondado em parcelas");

            System.out.println("TOTAL DE " + vl + " parcelas de " + prodVal + " = " + prodVal * vl);

        } else {

            for (int i = 1; i < parc.length; i++) {

                if (i != parc.length - 1) {
                    System.out.println("Parcela nº " + i + " no valor de " + (arredondar(prodVal)));

                    String strProv = Double.toString(prodVal);

                    // String dd = (strProv.substring(Math.max(0, strProv.length() - 2)));

                        System.out.println("Parcela nº " + i + " no valor de pagamento1" + arredondar(prodVal));

                        String val = arredondar(prodVal);
                        String dado = val.substring(Math.max(0, val.length() - 2));
                        Double str = Double.parseDouble(dado);

                        convertInt(str, parc.length);
               
                    

                }

                for (int j = 1; j <= vl; j++) {
                    if (i == vl && j == vl) {

                        String strProv = Double.toString(prodVal);

                        if (strProv.substring(Math.max(0, strProv.length() - 2)) != null) {

                            System.out.println(
                                    "Parcela nº " + i + " no valor de pagamento aredondado " + (arredondar(prodVal)));

                            break;
                        }
                    }
                }
            }
        }
    }

    private static String arredondar(double media) {
        DecimalFormat df = new DecimalFormat("0.00");

        df.setRoundingMode(RoundingMode.HALF_UP);

        return df.format(media);
    }

    public static String getLastN(String s, int n) {
        if (s == null) {
            return null;
        }

        String str = s.substring(Math.max(0, s.length() - n));

        System.out.println("STR=> " + str);
        return s.substring(Math.max(0, s.length() - n));
    }


    private static String convertInt(Double duplo, Integer length){
        String sDouble = Double.toString(duplo); //Convertendo para String para retornar uma String adaptando ao seu contexto.
    
        StringBuilder doisUltimosCharacteres = new StringBuilder(); //StringBuilder representativo apenas para pegarmos os 2 últimos caracteres do valor recebido como parâmetro
    
        doisUltimosCharacteres.append(sDouble.charAt(sDouble.length() -2 )); //Pega o penultimo valor da String...
        doisUltimosCharacteres.append(sDouble.charAt(sDouble.length() -1)); //... e concatena com o último para verificarmos se esses dois ultimos caracteres são '.0'
    
        if(doisUltimosCharacteres.toString().equals(".0")){ //Aqui validamos se os dois ultimos caracteres são '.0', se for, retornamos o valor como desejado  
        String dadoBuilde = sDouble.substring(0, sDouble.length() -2);

        for (int i = 0; i < length; i++) {

           String sum = dadoBuilde;
           Integer pars = Integer.parseInt(sum);
           System.out.println("doisUltimosCharacteres =>"+ ((pars*length)));
        }
        
            return sDouble.substring(0, sDouble.length() -2);
        }
    
        return sDouble; //retorna o valor enviado por parâmetro sem modificações.
    }

    // private static BigDecimal formatVal(double media) {
    // BigDecimal bd = new BigDecimal(media).setScale(2, RoundingMode.HALF_UP);

    // System.out.println(bd);

    // return bd;

    // }

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

// public List<FaturaContasReceberParcelas> gerarParcelasModulo(final
// FaturaContasReceber fatura, final PlanoPagamento plpa, final BigDecimal
// valor, final boolean store) {
// final List<PlanoPagamentoParcela> parcelasPlano =
// plppService.findByPlano(plpa);
// final List<FaturaContasReceberParcelas> parcelas = new ArrayList<>();
// Calendar ultimaData = null;
// BigDecimal total = BigDecimal.ZERO;
// FaturaContasReceberParcelas ultimaParcela = null;

// for (PlanoPagamentoParcela parcelaPlano : parcelasPlano) {
// final FaturaContasReceberParcelas parcela = new
// FaturaContasReceberParcelas();
// parcela.setParcela(parcelaPlano.getNumero());
// parcela.setFatura(fatura);
// parcela.setValor(BigDecimalUtils.getPercentegeValue(valor,
// parcelaPlano.getPercentual(), 2, RoundingMode.HALF_UP));
// parcela.setSaldo(parcela.getValor());

// total = total.add(parcela.getValor());
// ultimaParcela = parcela;

// if (plpa.getVencimentoFixo() == SimNaoType.SIM) {
// final Calendar data;

// if (ultimaData == null) data = (Calendar) fatura.getData().clone();
// else data = (Calendar) ultimaData.clone();

// data.add(Calendar.MONTH, 1);

// final int proximoMes = data.get(Calendar.MONTH);

// data.set(Calendar.DAY_OF_MONTH, plpa.getDiaVencimento());

// if (proximoMes != data.get(Calendar.MONTH)) {
// data.set(Calendar.DAY_OF_MONTH, 1);
// }

// ultimaData = data;

// parcela.setVencimento(data);
// } else {
// final Calendar data = (Calendar) fatura.getData().clone();
// data.add(Calendar.DAY_OF_MONTH, parcelaPlano.getDias());

// parcela.setVencimento(data);
// }

// parcelas.add(parcela);
// }

// if (ultimaParcela != null) {
// ultimaParcela.setValor(ultimaParcela.getValor().subtract(total.subtract(valor)));
// ultimaParcela.setSaldo(ultimaParcela.getValor());
// }

// if (store) fcrpService.insert(parcelas);

// return parcelas;
// }