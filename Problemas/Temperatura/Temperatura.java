import java.io.*;

public class Temperatura {
    public static void main(String[] args) {
	int casos;
	int n_temperaturas;
	String [] datos;
	int [] fin = new int [2];
	try {
	    BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

	    String x = br.readLine();
	    casos = Integer.parseInt(x.split(" ")[0]);
	    x = br.readLine();
	    for (int i = 0; i < casos; i++) {
		n_temperaturas = Integer.parseInt(x.split(" ")[0]);
		x = br.readLine();
		datos = x.split(" ");		    
		fin = eval(datos);
		System.out.println(fin[0] + " " + fin [1]);
		x = br.readLine();
	    }

	}
	catch (Throwable e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}

    }

    private static int [] eval (String [] datos) {
	int [] set3 = new int [3];
	int [] n = {0,0}; //[picos][valles]
	if (datos.length < 3) return n;
	for (int i = 0; i < datos.length-2; i++) {
	    for (int j = 0; j < 3; j++) {
		set3[j] = Integer.parseInt(datos[i+j]);
	    }
	    n[0] = n[0] +  evalPicos(set3);
	    n[1] = n[1] +  evalValles(set3);
	}
	return n;
	
    }

    private static int evalPicos(int [] set3) {
	if ((set3[0] < set3[1]) && (set3[1] > set3[2]))
	    return 1;
	return 0;
    }
    private static int evalValles(int [] set3) {
	if ((set3[0] > set3[1]) && (set3[1] < set3[2]))
	    return 1;
	return 0;
    }

}
