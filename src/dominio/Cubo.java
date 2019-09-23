package dominio;

import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Set;
import java.util.regex.Matcher;

import dominio.constantes.Constantes;

public class Cubo {
	
	
	public Hashtable<String, Integer> hm = new Hashtable<String, Integer>();

	public int update(int x, int y, int z, int w) {
		String key = z + " " + y + " " + x;
		hm.put(key, w);
		return hm.get(key);
	}

	public BigInteger query(int x1, int y1, int z1, int x2, int y2, int z2) {
		BigInteger sum = new BigInteger("0");
		
		Set<String> keys = hm.keySet();
        for(String key: keys){
        	Integer value = hm.get(key);
        	Matcher match = Constantes.tripla.matcher(key);
			int x, y, z;
			if(match.find()) {
				z = Integer.parseInt(match.group(1));
				y = Integer.parseInt(match.group(2));
				x = Integer.parseInt(match.group(3));
				if (x >= x1 && x <= x2 && y >= y1 && y <= y2 && z >= z1 && z <= z2) {
					BigInteger sumval = new BigInteger("" + value);
					sum = sum.add(sumval);
				}	
			}
        }

		return sum;
	}
	
}
