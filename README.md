![array](https://user-images.githubusercontent.com/66473846/211609966-d7664d9d-65de-4124-853b-87768b083f5c.png)

#
#

# Calendar

Classe Calendar

Essa classe pode produzir os valores de todos os campos de calendário necessários para implementar a formatação de data e hora, para uma determinada língua e estilo de calendário. Por exemplo, japonês, americano, italiano, brasileiro entre outros.

A classe Calendar é a mais usada quando se trata de datas, mas como é uma classe abstrata, 
### não pode ser instanciada, portanto para obter um calendário é necessário usar o método estático getInstance(), 
apresentado no exemplo da Listagem 2.

```ruby
import java.util.Calendar;

public class Data_Calendar{

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Data e Hora atual: "+c.getTime());
	}
}
```

#

Listagem 2. Recuperação da data com a classe Calendar
Com a classe Calendar também se consegue manipular a data e hora com os métodos que são fornecidos, abaixo seguem os exemplos.

```ruby
import java.util.Calendar;

public class Testa_Metodo_Get_Calendar{

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	}
}
```
#

Listagem 3. Mostra o dia da semana, mês e ano

```ruby
import java.util.Calendar;

public class Testa_Metodos_Set_Get_Calendar{

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 1995);
		c.set(Calendar.MONTH, Calendar.MARCH);
		c.set(Calendar.DAY_OF_MONTH, 20);

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	}

}
```
Listagem 4. Alterando a data/hora com método set

#
#

# DecimalFormat

Criar uma formatação personalizada utilizando o objeto DecimalFormat. Por exemplo:

```ruby
import java.text.DecimalFormat;
 public class Formata {

  public static void main(String[] args) {

  double valor = 2000.0;
  double vezes = 3.0;
  double prestacao = valor/vezes;

  DecimalFormat df = new DecimalFormat("0.##");
  String dx = df.format(prestacao);

  System.out.print(dx);

  }
  // sera impresso : 666,67
 }
 ```

Algumas strings de formatação que podem ser utilizadas com o Decimal Format

![numberformat](https://user-images.githubusercontent.com/66473846/212350646-efbee791-7ab1-4362-9401-45753541a2c7.png)

É importante lembrar que DecimalFormat não é adequada para formatar notações científica, tabelas com colunas de largura fixa e nem números em formato hexadecimal ou octal.

#
#

A classe 
# NumberFormat, faz parte do pacote java.text e 
# permite formatar números conforme a localização geográfica em que se encontra, 
realizando a distinção entre o sinal de ponto,milhar e de decimal, também identifica a posição do sinal do número e identifica o prefixo que indica a moeda em caso de valores monetários.

NumberFormat possui três mêtodos para formatar números, valores monetários e percentuais. Para fazer uso dela é necessário importa-la.
import java.text.NumberFormat;
Os principais métodos do NumberFormat são:

```ruby

getNumberInstance() - Retorna a instância de um objeto com base no formato da localidade padrão. É utilizado para numeros
getCurrencyInstance() - Usado para formatar moedas
getIntegerInstance() - Usado para formatar números ignorando casas decimais
getPercentInstance() - Usado para formatar frações pro exemplo 0,15 é formatado e mostrado como 15%
```

Exemplo:
```ruby
import java.text.NumberFormat;
 public class Formata {
  public static void main(String[] args) {

  System.out.println(NumberFormat.getCurrencyInstance().format(12345678.90));
  // imprimirÃ¡ R$ 12.345.678,90
  }
 }
 ```
Agora um exemplo para uma situação em que se há muitos números a serem formatados.

```ruby
import java.text.NumberFormat;
 public class Formata2 {
  public static void main(String[] args) {
  double n[]={523.34, 54344.23 ,95845.223 ,1084.895};

  NumberFormat z = NumberFormat.getCurrencyInstance();

  for (int a = 0; a < n.length; a++) {
  if(a != 0)
  System.out.print(", ");
  System.out.print(z.format(n[a]));
  }
  System.out.println();
  }
 }
 ```

