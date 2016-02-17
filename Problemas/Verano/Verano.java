import java.io.*;

public class Verano {

    public static void main(String[] args) {
	int line = 0;
        Double menor;
	boolean habemusMCD = false;
	int MCD = 1;
	try {
	    BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
	    
	    for (String x = br.readLine(); x != null; x = br.readLine()){
		MCD = 1;
		habemusMCD = false;
		String [] mesas = x.split(" ");
		menor = Double.parseDouble(mesas[0]);
		for (int i = 1; i < mesas.length-1; i++) {
		    if (menor > Double.parseDouble(mesas[i]))
			menor = Double.parseDouble(mesas[i]);
		}
		for (int i = 1; i < menor && !habemusMCD; i++) {
		    habemusMCD = (menor%(menor/i) == 0);
		    for (int j = 0; j < mesas.length-1 && habemusMCD; j++) {
			habemusMCD = habemusMCD && (Double.parseDouble(mesas[j])%(menor/i) == 0);
		    }
		    if (habemusMCD)
			MCD = (int) (menor/i);
		}
		int n_mesas = 0;
		for (int i = 0; i < mesas.length-1; i++) {
		    n_mesas += Integer.parseInt(mesas[i])/MCD;
		    
		}
		System.out.println(n_mesas);
		line += 1;
	    }
	}catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}
    }
}
