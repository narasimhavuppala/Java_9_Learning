
public class compare2dArray {
	public static void main(String args[]) {
		int a[] = { 1,023,053,4};
		int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
		System.out.println(a[2]);
		
		for(int i = 0; i < a.length-1; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("a[1] is " + a[1]);
		System.out.println(b[2][1]);
		System.out.println(a[3]==b[0][2] );
		System.out.println(" " + (a[2]==b[2][1]));
	}

}
