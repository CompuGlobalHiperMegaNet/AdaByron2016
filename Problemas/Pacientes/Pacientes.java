import java.io.*;

public class Pacientes {

    public static void main (String args[]) {
	int n=0;
	String x="";
	String [] pacientes;
	char[] tipoAccion;
	String nombrePaciente1 = "a";
	String nombrePaciente2 = "a";
	double nivelDolor1 = 0;
	double nivelDolor2 = 0;
	
	try {
	    BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
	    x = br.readLine();
	    n = Integer.parseInt(x);
	    
	    for (int i = 0; i<n; x = br.readLine(), i++){
		pacientes = x.split(" ");
		tipoAccion = pacientes[0].toCharArray();
		if (tipoAccion[0] != 'A'){
		    if (nombrePaciente1 != "" || i==0){
			nombrePaciente1 = pacientes[1];
			nivelDolor1 = Double.parseDouble(pacientes[2]);
		    }
		    x = br.readLine();
		    if (nombrePaciente2 != ""|| i==0){
			nombrePaciente2 = pacientes[1];
			nivelDolor2 = Double.parseDouble(pacientes[2]);
		    }
		}
		else {
		    if (nivelDolor1 > nivelDolor2){
			System.out.println(nombrePaciente1);
			nombrePaciente1 = "";
		    }
		    if (nivelDolor2 > nivelDolor1){
			System.out.println(nombrePaciente2);
			nombrePaciente2 = nombrePaciente1;
			nombrePaciente1 = "";
		    }
		}	
	    }	
	}catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}
    }
    
}
