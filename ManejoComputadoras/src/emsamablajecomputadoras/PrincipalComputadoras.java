/**
 * 
 */
package emsamablajecomputadoras;

import ComputerTypes.AsusROGE;
import ComputerTypes.AsusZenbook;
import DirectorClasses.ComputadorDirector;
import emsamablajecomputadoras.creacional.*;

/**
 * @author djurado
 *
 */
public class PrincipalComputadoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// AsusROGE
		ComputadorDirector directorAR= new ComputadorDirector(new AsusROGE());
		directorAR.ConstruirComputador();
		Computador AR= directorAR.GetComputador();
	
		
		// AsusZenbook
		ComputadorDirector directorAZ= new ComputadorDirector(new AsusZenbook());
		directorAZ.ConstruirComputador();
		Computador AZ= directorAZ.GetComputador();
		
		
	//Muestra por pantalla
		System.out.println("Computadora 1 \n"+AR.toString());
		System.out.println("Computadora 2 \n"+AZ.toString());
	}

}
