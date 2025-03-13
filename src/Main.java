import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 * @author Alexander Silvera
 */
public class Main {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		File ficheroOrigen = new File("M2_T02_Origen.txt");
		ArrayList<String> cadena = new ArrayList<String>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(ficheroOrigen))){
			String texto;
			while ((texto = br.readLine()) != null){
					cadena.add(texto);			 
				}	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		File ficheroDestino = new File("M2_02_Destino.txt");

		try(BufferedWriter bw = new BufferedWriter(new FileWriter(ficheroDestino))) {
			for (String string : cadena) {
				bw.append(reemplazaEspacio(string));
				bw.newLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Reemplaza espacio.
	 * Este método se encarga de reemplazar los espacios " " por guiones "-",
	 * devuelve un String 
	 *
	 * @param cadena the cadena
	 * @return the string
	 */
	static String reemplazaEspacio(String cadena) {
		cadena = cadena.replaceAll(" ","-");
		return cadena;
	}
}
