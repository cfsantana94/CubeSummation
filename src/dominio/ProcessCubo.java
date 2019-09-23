package dominio;


import java.util.regex.Matcher;

import dominio.constantes.Constantes;

public class ProcessCubo {

	public static String processInput(String[] input) {
		// TODO Auto-generated method stub
		int t, line = 0;
		t = Integer.parseInt(input[line++]);
		String in, out = "";

		while (t > 0) {
			int n, m;
			in = input[line++];
			Matcher match = Constantes.p.matcher(in);
			Cubo cubo = new Cubo();
			if (match.find()) {
				n = Integer.parseInt(match.group(1));
				m = Integer.parseInt(match.group(2));

				while (m > 0) {
					int x1, y1, z1, x2, y2, z2, w;
					in = input[line++];
					match = Constantes.p_update.matcher(in);
					if (match.find()) {
						x1 = Integer.parseInt(match.group(1));
						y1 = Integer.parseInt(match.group(2));
						z1 = Integer.parseInt(match.group(3));
						w = Integer.parseInt(match.group(4));
						cubo.update(x1 - 1, y1 - 1, z1 - 1, w);
					} else {
						match = Constantes.p_query.matcher(in);
						if (match.find()) {
							x1 = Integer.parseInt(match.group(1));
							y1 = Integer.parseInt(match.group(2));
							z1 = Integer.parseInt(match.group(3));
							x2 = Integer.parseInt(match.group(4));
							y2 = Integer.parseInt(match.group(5));
							z2 = Integer.parseInt(match.group(6));
							out += cubo.query(x1 - 1, y1 - 1, z1 - 1, x2 - 1, y2 - 1, z2 - 1) + "\n";
						}
					}
					m--;
				}
			}
			t--;
		}
		return out;
	}

}
