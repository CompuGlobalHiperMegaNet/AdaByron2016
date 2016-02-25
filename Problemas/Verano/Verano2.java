import java.io.*;

public class Verano2 {
    
    private static int MinCD(int p, double q) {	
        if (q == 0) return p;
        else return MinCD((int)q, p % (int)q);
    }
    
    public static void main(String[] args) {
	//long startTime = System.currentTimeMillis();
	double menor;
	int MCD = 1;
	double acc;
	try {
	    BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
	    for (String x = br.readLine(); x != null; x = br.readLine()){
		String [] mesas = x.split(" ");
		acc = 0;
		menor = Double.parseDouble(mesas[0]);
		if (menor == 0 || menor >= 1e18){;}
		else {
		    MCD = MinCD((int)menor, Double.parseDouble(mesas[1]));
		    acc = menor + Double.parseDouble(mesas[1]);
		    for (int i = 2; i < mesas.length-1; i++) {
			MCD = MinCD(MCD, Integer.parseInt(mesas[i]));
			acc = acc + Double.parseDouble(mesas[i]);
			if (acc >= 1e18) i = mesas.length;
		    }
		    System.out.println((int)acc/MCD);
		}
	    }
	}catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
		e.printStackTrace();
	}
	//	long endTime = System.currentTimeMillis();
	//	System.out.println("Tiempo : " + (endTime-startTime));
    }
}

