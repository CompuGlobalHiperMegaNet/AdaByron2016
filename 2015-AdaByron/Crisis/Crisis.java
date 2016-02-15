import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Crisis {

    private static final String texto = "3\n1 3 6\n4\n1 3 2 5\n3\n6 6 6\n0";
    
    private static String input;
    
    public static void main(String[] args) {

	input = input();
	System.out.println(input);
	System.out.println(count_index(input));
	
    }
    
    private int[][] parser(String text) {
	int position = 0;
	return new int [1][1];
    }
    
    private static int count_index (String text) {
	int index = 0;
	if (text.charAt(0) != '0'){
	    index++;
	    for (int i = 1; i<text.length()-1; i++){
		if ((text.charAt(i+1) == '\n' && (text.charAt(i-1) == '\n'))
		    && text.charAt(i) != '0' )
		    index += 1;
	    }
	}
	return index;
    }
  
    private static String input(){
	String input;
	String returned = "";
	try {
	    BufferedReader br = 
		new BufferedReader(new InputStreamReader(System.in));		
	    
	    while((input=br.readLine())!=null){
		returned += input + "\n";
	    }
	}
	catch (IOException e) {
	    System.out.println("Error " + e.getMessage());
	    e.printStackTrace();
	}
	return returned;
    }
}

    
