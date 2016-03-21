import java.util.Date;

public class Contexto 
{
	private Estado estado;
	private String nome;
	private Date data;
	
	public Contexto()
	{
		estado = null;
	}
	
	public void setContexto(Estado estado)
	{
		this.estado = estado;
	}
	
	public Estado getEstado()
	{
		return estado;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public void setDataExtravio(Date data)
	{
		this.data = data;
	}
	
	public Date getDataExtravio()
	{
		return data;
	}
}
