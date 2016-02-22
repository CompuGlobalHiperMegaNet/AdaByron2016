import java.io.*;

public class FinMes {

    public static void main(String[] args) {
	int casos;
	try {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
	    String x = br.readLine();
	    String [] datos = new String [2];
	    casos = Integer.parseInt(x.toString());
	    x = br.readLine();
	    for (int i = 0; i < casos; i++) {
		datos = x.split(" ");
		if((Integer.parseInt(datos[0])+ Integer.parseInt(datos[1])) >= 0) System.out.println("SI");
		else System.out.println("NO");
		x = br.readLine();
	    }   
	}catch (Exception e){
	    System.out.println("Error " + e.getMessage());
            e.printStackTrace();
	}
    }
}
