import java.util.Date;

public class Contexto 
{
	private Estado estado;
	private String nome;
	private Date data;
	private Date data1;
	private Date data2;
	private Date data3;
	private Date data4;
	private Boolean bool;
	
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
	
	public void setDataDescartado(Date data)
	{
		this.data = data;
	}
	
	public Date getDataDescartado()
	{
		return data;
	}
	
	public void setDataDanificado(Date data)
	{
		this.data = data;
	}
	
	public Date getDataDanificado()
	{
		return data;
	}
	
	public void setDataEnvioConserto(Date data1)
	{
		this.data1 = data1;
	}
	
	public Date getDataEnvioConserto()
	{
		return data1;
	}
	
	public void setDataConserto(Date data2)
	{
		this.data2 = data2;
	}
	
	public Date getDataConserto()
	{
		return data2;
	}
	
	public void setDataRecuperado(Date data)
	{
		this.data = data;
	}
	
	public Date getDataRecuperado()
	{
		return data;
	}
	
	public void setDataParaSerRetirado(Date data1)
	{
		this.data1 = data1;
	}
	
	public Date getDataParaSerRetirado()
	{
		return data1;
	}
	
	public void setDataRetirada(Date data2)
	{
		this.data2 = data2;
	}
	
	public Date getDataRetirada()
	{
		return data2;
	}
	
	public void setDataParaSerDevolvido(Date data3)
	{
		this.data3 = data3;
	}
	
	public Date getDataParaSerDevolvido()
	{
		return data3;
	}	
	
	public void setDataParaDevolucao(Date data4)
	{
		this.data4 = data4;
	}
	
	public Date getDataDevolucao()
	{
		return data4;
	}
	
	public void setStatusReserva(Boolean bool)
	{
		this.bool = bool;
	}
	
	public Boolean getStatusReserva()
	{
		return bool;
	}
	
	public void setDataExpirarReserva(Date data1)
	{
		this.data1 = data1;
	}
	
	public Date getDataExpirarReserva(Date data1)
	{
		return data1;
	}
	
	
	
}
