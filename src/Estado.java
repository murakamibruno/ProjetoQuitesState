import java.util.Date;

public interface Estado
{
	public void informarEstado(Contexto contexto);
	public void informarNome(Contexto contexto , String nome);
	public void informarDataEmprestimo();
	public void informarDataDevolucao();
	public void informarDataExtravio(Contexto contexto, Date data);
}
