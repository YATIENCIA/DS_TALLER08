package DirectorClasses;

import AbstractClasses.ComputadorBuilder;
import emsamablajecomputadoras.creacional.Computador;

public class ComputadorDirector {
 
	private ComputadorBuilder builder;
	
	public ComputadorDirector(ComputadorBuilder builder)
	{
		this.builder=builder;
	}
	
	public void ConstruirComputador()
	{
		builder.DefinirComputador();
		builder.DesarrollarSO();
		builder.DesarrollarMainBoard();
		builder.DefinirExtras();
	}
	
	
	public Computador GetComputador() {
		return builder.GetComputador();
	}
}
