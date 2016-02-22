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
<<<<<<< HEAD
		llego(Integer.parseInt(datos[0]), Integer.parseInt(datos[1]));
		x = br.readLine();
	    }
		
=======
		if((Integer.parseInt(datos[0])+ Integer.parseInt(datos[1])) >= 0) System.out.println("SI");
		else System.out.println("NO");
		x = br.readLine();
	    }   
>>>>>>> 4fe73c1ae8f3305046a9957352479694c25c6416
	}catch (Exception e){
	    System.out.println("Error " + e.getMessage());
            e.printStackTrace();
	}
<<<<<<< HEAD

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
=======
    }
}
>>>>>>> 4fe73c1ae8f3305046a9957352479694c25c6416
