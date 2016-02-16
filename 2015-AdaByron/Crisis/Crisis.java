import java.io.*;

public class Crisis {

    public static void main(String[] args) {
	StringBuilder input = new StringBuilder();
	try {
	    BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));
	    
	    for (String x = br.readLine(); x != null; x = br.readLine()){
		input.append(x + "\n");
	    }
	}catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}

	while (input.length() > 3){
	    int index = Character.getNumericValue(input.charAt(0));
	    input.delete(0,2);
	    String[] values = input.substring(0,index*2 - 1).split(" ");
	    input.delete(0, index*2);
	    int j;
	    for (j=0; j < index -1
		     && Double.parseDouble(values[j]) < Double.parseDouble(values[j+1]); j++);
	    System.out.println(!(j<index-1));
	    
	}

    }
}
    // public static void printString (StringBuilder c){
    // 	for (int i = 0; i < c.length(); i++) {
    // 	    System.out.print(c.charAt(i));
    // 	}
    // }

    // public static String toString(String [] cadena) {
    // 	String rt = "";
    // 	for (int i = 0; i < cadena.length; i++) {
    // 	    rt += cadena[i].toString() + " ";
    // 	}
    // 	return rt;
    // }

	// String [] parsed = input.toString().split("\n");
	// for (int i = 0; i < parsed.length-1; i+=2) {
	//     String [] index = parsed[i+1].split(" ");
	//     int j;
	//     for (j=0; j < index.length-1
	// 	     && Integer.parseInt(index[j]) < Integer.parseInt(index[j+1]); j++);
	//     System.out.println(!(j<index.length-1));
