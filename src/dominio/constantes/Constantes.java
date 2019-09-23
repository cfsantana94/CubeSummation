package dominio.constantes;

import java.util.regex.Pattern;

public class Constantes {

	private Constantes() {
		
	}
	public static final Pattern tripla = Pattern.compile("([0-9]+) ([0-9]+) ([0-9]+)");
	public static final Pattern p = Pattern.compile("([0-9]+) ([0-9]+)");
	public static final Pattern p_update = Pattern.compile("UPDATE ([0-9]+) ([0-9]+) ([0-9]+) ([0-9]+)");
	public static final Pattern p_query = Pattern.compile("QUERY ([0-9]+) ([0-9]+) ([0-9]+) ([0-9]+) ([0-9]+) ([0-9]+)");


}
