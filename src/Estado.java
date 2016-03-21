import java.util.Date;

public interface Estado
{
	public void informarEstado(Contexto contexto);
	public void informarNome(Contexto contexto , String nome);
	public void informarDataRetirada(Contexto contexto, Date data);
	public void informarDataParaSerRetirado(Contexto contexto, Date data);
	public void informarDataDevolucao(Contexto contexto, Date data);
	public void informarDataParaSerDevolvido(Contexto contexto, Date data);
	public void informarDataExtravio(Contexto contexto, Date data);
	public void informarDataDescartado(Contexto contexto, Date data);
	public void informarDataDanificado(Contexto contexto, Date data);
	public void informarDataEnvioConserto(Contexto contexto, Date data);
	public void informarDataConserto(Contexto contexto, Date data);
	public void informarDataRecuperado(Contexto contexto, Date data);
	public void informarStatusReserva(Contexto contexto, Boolean bool);
	public void informarDataExpirarReserva(Contexto contexto, Date data);
}
