import java.util.*;

class demo {
	public static void main(String[] args){

		Scanner tx = new Scanner(System.in);

		System.out.println("Enter input");
		int num= tx.nextInt();

		for (int i=10 ;i>=1; --i){

			int table=num*i;

			System.out.println(table);
		}
	}
}
			

