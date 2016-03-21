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
		
		Descartado descartado = new Descartado();
		descartado.informarEstado(contexto);
		descartado.informarNome(contexto, "O principe");
		Date data_descartado = parseToDate("31012016");
		descartado.informarDataDanificado(contexto, data_descartado);
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " na data " + contexto.getDataDescartado());
		
		Danificado danificado = new Danificado();
		danificado.informarEstado(contexto);
		danificado.informarNome(contexto, "O principe");
		Date data_danificado = parseToDate("02022016");
		descartado.informarDataDanificado(contexto, data_danificado);
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " na data " + contexto.getDataDescartado());
		
		Conserto conserto = new Conserto();
		conserto.informarEstado(contexto);
		conserto.informarNome(contexto, "O principe");
		Date data_envio_conserto =  parseToDate("01032016");
		conserto.informarDataEnvioConserto(contexto, data_envio_conserto);
		Date data_conserto = parseToDate("15032016");
		conserto.informarDataConserto(contexto, data_conserto);
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " na data " + contexto.getDataEnvioConserto() +
				" e chegou na data " + contexto.getDataConserto());
		
		// cria uma instancia do estado disponivel
		// informa o estado a partir da instancia de contexto
		disponivel.informarEstado(contexto);
		// anexa o nome ao livro disponivel naquele contexto
		disponivel.informarNome(contexto , "O principe");
		Date data_disponivel = parseToDate("01042016");
		disponivel.informarDataRecuperado(contexto, data_disponivel);
		// gera uma saida
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " e foi recuperado no dia: " 
		+ contexto.getDataRecuperado());
		
		
		Emprestado emprestado = new Emprestado();
		emprestado.informarEstado(contexto);
		emprestado.informarNome(contexto, "O principe");
		Date data_para_ser_retirado = parseToDate("02042016");
		Date data_retirada = parseToDate("02042016");
		Date data_para_ser_devolvido = parseToDate("09042016");
		Date data_devolucao = parseToDate("08042016");
		// Data prevista para retirada
		emprestado.informarDataParaSerRetirado(contexto, data_para_ser_retirado);
		// Data que foi de fato retirado
		emprestado.informarDataRetirada(contexto, data_retirada);
		// Prazo para devolucao
		emprestado.informarDataParaSerDevolvido(contexto, data_para_ser_devolvido);
		// Data que foi devolvido
		emprestado.informarDataDevolucao(contexto, data_devolucao);
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " sua data para retirada foi: "
		+ contexto.getDataParaSerRetirado() + " e foi de fato retirado no dia: " + contexto.getDataRetirada() + " e tem prazo de entraga ate o dia: " + 
				contexto.getDataParaSerDevolvido() + " e foi devolvido no dia: " + contexto.getDataDevolucao());
		
		EmprestadoReservado emprestadoReservado = new EmprestadoReservado();
		emprestadoReservado.informarEstado(contexto);
		emprestadoReservado.informarNome(contexto, "O principe");
		Boolean bool_reserva = true;
		emprestadoReservado.informarStatusReserva(contexto, bool_reserva);
		if (contexto.getStatusReserva() == true)
		{
			System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString());
		}
		else
		{
			System.out.println("O livro " + contexto.getNome() + " se encontra emprestado e nao reservado");
		}
		
		DevolvidoReservado devolvidoReservado = new DevolvidoReservado();
		devolvidoReservado.informarEstado(contexto);
		devolvidoReservado.informarNome(contexto, "O principe");
		Boolean bool_reserva2 = true;
		devolvidoReservado.informarStatusReserva(contexto, bool_reserva2);
		if (contexto.getStatusReserva() == true)
		{
			System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString());
		}
		else
		{
			System.out.println("O livro " + contexto.getNome() + " se encontra devolvido e nao reservado");
		}
		
		disponivel.informarEstado(contexto);
		disponivel.informarNome(contexto , "O principe");
		Date data_disponivel_2 = parseToDate("31122016");
		disponivel.informarDataExpirarReserva(contexto, data_disponivel_2);
		System.out.println("O livro " + contexto.getNome() + " se encontra " + contexto.getEstado().toString() + " e foi expirada a reserva no dia: " 
		+ contexto.getDataExpirarReserva(data_disponivel_2));
		
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
