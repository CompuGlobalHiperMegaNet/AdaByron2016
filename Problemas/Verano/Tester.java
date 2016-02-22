import java.util.Random;

public class Tester {

    private static Random seed = new Random();

    public static void main(String[] args) {

	for (int j = 0; j < 10000; j++) {

	    for (int i = 0; i < 1000; i++) {
		int grupete = (int)(seed.nextDouble() * 100000 + 1);
		System.out.print(grupete + " ");
	    }

	    System.out.println("0");
	}
	
    }
}
