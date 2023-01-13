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




