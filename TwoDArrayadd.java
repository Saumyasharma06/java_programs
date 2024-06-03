import java.util.Scanner;
public class TwoDArrayadd {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows1 = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns1 = sc.nextInt();
        System.out.print("Enter the number of rows: ");
		int rows2 = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int columns2 = sc.nextInt();
		int[][] array1 = new int[rows1][columns1];
        int[][] array2 = new int[rows2][columns2];
        int[][] res = new int[rows1][rows2];
    
		
		System.out.println("Enter the elements of the array1:");

		for (int i = 0; i < rows1; i++) {
			for (int j = 0; j < columns1; j++) {
				System.out.print("Enter element at position [" + i + "][" + j + "]: ");
				array1[i][j] = sc.nextInt();
			}
		}
        System.out.println("Enter the elements of the array2:");
        for (int i = 0; i < rows2; i++) {
			for (int j = 0; j < columns2; j++) {
				System.out.print("Enter element at position [" + i + "][" + j + "]: ");
				array2[i][j] = sc.nextInt();
			}
		}
        // for (int i = 0; i < rows2; i++) {
		// 	for (int j = 0; j < columns2; j++) {
		// 		res[3][3]=
		// 	}
		// }
        

		sc.close();
    }

}
