package AbstractClasses;

import emsamablajecomputadoras.creacional.Computador;

public abstract class ComputadorBuilder {
	protected Computador c;
	
	public Computador GetComputador()
	{
		return c;
	}
	
	public abstract void DefinirComputador();
	public abstract void DesarrollarSO();
	public abstract void DesarrollarMainBoard();
	public abstract void DefinirExtras();
}
