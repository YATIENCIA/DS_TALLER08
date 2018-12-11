package ComputerTypes;

import AbstractClasses.ComputadorBuilder;
import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusZenbook extends ComputadorBuilder{

	@Override
	public void DefinirComputador() {
		c=new Computador();
		c.setMarca("ASUS");
		c.setModelo("Zenbook");
	}

	@Override
	public void DesarrollarSO() {
		SistemaOperativo SO= new SistemaOperativo();
		SO.setArquitectura(64);
		SO.setNombre("Windows");
		SO.setVersion("10 HOME");
		c.setOs(SO);
	}

	@Override
	public void DesarrollarMainBoard() {
		Mainboard mb= new Mainboard();
		mb.setModelo("PRIME");
		mb.setNumeracion("Z370");
		c.setPlaca(mb);
	}
	
	@Override
	public void DefinirExtras() {
		c.setRam(16);
		c.setAlmacenamiento(500);
		c.setTipoRam("ddr3");
		c.setTipoAlmacenamiento("SSD");
		c.setCoolerExterno(false);
	}
	
}
