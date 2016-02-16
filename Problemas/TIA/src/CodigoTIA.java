import java.io.*;

public class CodigoTIA {

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
		    String [] codes = x.split(" ");
		    String word  = br.readLine();
		    line+=1;
		}
		line += 1;
	    }
	}catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}
    }34
}

