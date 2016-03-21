import java.util.Date;

public class Disponivel implements Estado 
{
	public void informarEstado(Contexto contexto)
	{
		contexto.setContexto(this);
	}
	
	public String toString()
	{
		return "Disponivel";
	}

	public void informarNome(Contexto contexto, String nome) 
	{
		contexto.setNome(nome);
	}

	public void informarDataEmprestimo() 
	{	
	}

	public void informarDataDevolucao() 
	{		
	}

	public void informarDataExtravio(Contexto contexto, Date data) 
	{
		
	}
		
}