package ComputerTypes;

import AbstractClasses.ComputadorBuilder;
import emsamablajecomputadoras.creacional.Computador;
import emsamablajecomputadoras.creacional.Mainboard;
import emsamablajecomputadoras.creacional.SistemaOperativo;

public class AsusROGE extends ComputadorBuilder{

	@Override
	public void DefinirComputador() {
		c=new Computador();
		c.setMarca("ASUS");
		c.setModelo("ROG");
	}

	@Override
	public void DesarrollarSO() {
		SistemaOperativo SO= new SistemaOperativo();
		SO.setArquitectura(64);
		SO.setNombre("Windows");
		SO.setVersion("10 PRO");
		c.setOs(SO);
	}

	@Override
	public void DesarrollarMainBoard() {
		Mainboard mb= new Mainboard();
		mb.setModelo("Strix");
		mb.setNumeracion("x99");
		c.setPlaca(mb);
	}
	
	@Override
	public void DefinirExtras() {
		c.setRam(32);
		c.setTipoRam("ddr4");
		c.setTipoAlmacenamiento("HDD");
		c.setAlmacenamiento(1000);
		c.setCoolerExterno(false);
	}
	

}
