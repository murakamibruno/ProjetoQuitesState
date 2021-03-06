import java.util.Date;

public class Emprestado implements Estado
{

	@Override
	public void informarEstado(Contexto contexto) 
	{
		contexto.setContexto(this);
	}
	
	public String toString()
	{
		return "Emprestado";
	}

	@Override
	public void informarNome(Contexto contexto, String nome) 
	{
		contexto.setNome(nome);
		
	}



	@Override
	public void informarDataExtravio(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataDescartado(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataDanificado(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataEnvioConserto(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataConserto(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataRecuperado(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataRetirada(Contexto contexto, Date data) {
		contexto.setDataRetirada(data);
	}

	@Override
	public void informarDataParaSerRetirado(Contexto contexto, Date data) {
		contexto.setDataParaSerRetirado(data);
		
	}

	@Override
	public void informarDataDevolucao(Contexto contexto, Date data) {
		contexto.setDataParaDevolucao(data);
	}

	@Override
	public void informarDataParaSerDevolvido(Contexto contexto, Date data) {
		contexto.setDataParaSerDevolvido(data);
	}

	@Override
	public void informarStatusReserva(Contexto contexto, Boolean bool) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void informarDataExpirarReserva(Contexto contexto, Date data) {
		// TODO Auto-generated method stub
		
	}

}
