import java.Math

    public class documentacion {
    
    static BigInteger binomial(final int N, final int K) {
	BigInteger ret = BigInteger.ONE;
	for (int k = 0; k < K; k++) {
	    ret = ret.multiply(BigInteger.valueOf(N-k))
		.divide(BigInteger.valueOf(k+1));
	}
	return ret;
    }

    private static int mcd(int p, double q) {	
        if (q == 0) return p;
        else return mcd((int)q, p % (int)q);
    }

    public static int mcm(int num1, int num2) {
        int mcm = 0;
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
        mcm = (a/mcd(a, b))*b;
        return mcm;
    }

    // QUICKSORT

    public static int Partition(int[] numbers, int left, int right) {

        int pivot = numbers[left];
        while (true) {
	    while (numbers[left] < pivot)
		left++;
	    while (numbers[right] > pivot)
		right--;
	    if (left < right) {
		int temp = numbers[right];
		numbers[right] = numbers[left];
		numbers[left] = temp;
	    }else{
		return right;
	    }    
	}

    }

    public static void QuickSort_Recursive(int[] arr, int left, int right){
        // For Recusrion
        if(left < right){
	    int pivot = Partition(arr, left, right);
	    if(pivot > 1)
		QuickSort_Recursive(arr, left, pivot - 1);
	    if(pivot + 1 < right)		
		QuickSort_Recursive(arr, pivot + 1, right);	    
	}	
    }

    int binary_search(int A[], int key, int imin, int imax){
	// test if array is empty
	if (imax < imin)
	    // set is empty, so return value showing not found
	    return KEY_NOT_FOUND;
	else{
	    // calculate midpoint to cut set in half
	    int imid = midpoint(imin, imax);
	    
	    // three-way comparison
	    if (A[imid] > key)
		// key is in lower subset
		return binary_search(A, key, imin, imid - 1);
	    else if (A[imid] < key)
		// key is in upper subset
		return binary_search(A, key, imid + 1, imax);
	    else
		// key has been found
		return imid;
	}
    }
    
}
