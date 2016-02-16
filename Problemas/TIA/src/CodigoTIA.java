import java.io.*;

public class Tragraperras {

    public static void main(String[] args) {
	int index;
	int line = 0;
	try {
	    BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
	    
	    for (String x = br.readLine(); x != null; x = br.readLine()){
		if (line%3 == 0) { //Estamos en índice
		    index = Integer.parseInt(x);
		}else{ //Estamos en entrada de datos
		    
		}
		line += 1;
	    }
	}catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}
    }
}

