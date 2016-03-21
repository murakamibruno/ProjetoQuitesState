import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main
{
	public static void main(String[] args) throws ParseException
	{
		// cria uma instancia de contexto
		Contexto contexto = new Contexto();	
		
		// cria uma instancia do estado disponivel
		Disponivel disponivel = new Disponivel();
		// informa o estado a partir da instancia de contexto
		disponivel.informarEstado(contexto);
		// anexa o nome ao livro disponivel naquele contexto
		disponivel.informarNome(contexto , "O principe");
		// gera uma saida
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString());
		
		//cria uma instancia do estado extraviado
		Extraviado extraviado = new Extraviado();
		// informa o estado a partir da instancia de contexto
		extraviado.informarEstado(contexto);
		// anexa o nome ao livro extraviado
		extraviado.informarNome(contexto, "O principe");
		// faz parse do Inteiro para um date
		Date data_extravio = parseToDate("01012016");
		// anexa a data de extravio ao livro
		extraviado.informarDataExtravio(contexto, data_extravio);
		// gera uma saida
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " na data " + contexto.getDataExtravio());
		
		
	}
	
	public static Date parseToDate(String data) throws ParseException
	{
		//Utilizado para capturar o formato em qual a data devera ser escrita
		SimpleDateFormat formatter = new SimpleDateFormat("ddMMyyyy");	
		// Faz o Parse da String pra Date
		Date data_final = formatter.parse(data);
		//Retorna o valor final em Date.
		return data_final;
	}
	
}
