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
		llego(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
		x = br.readLine();
	    }
		
	}catch (Exception e){
	    System.out.println("Error " + e.getMessage());
            e.printStackTrace();
	}

    }

    private static void llego(int primero, int segundo) {
	if ((primero+segundo) >= 0){
	    System.out.println("SI");
	}else{
	    System.out.println("NO");
	}
    }
}
	
upm
