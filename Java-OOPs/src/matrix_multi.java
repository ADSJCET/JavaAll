
public class matrix_multi {

	public static void main(String[] args) {
	int row1,col1,row2,col2,i,j,k;
	Scanner scan =new Scanner(System.in);
	System.out.print("Enter array and column size of matrix 1\n");
	row1=scan.nextInt();
	col1=scan.nextInt();
	System.out.print("Enter array and column size of matrix 2\n");
	row2=scan.nextInt();
	col2=scan.nextInt();
	int mat1[][]=new int[row1][col1];
	int mat2[][]=new int[row2][col2];
	int mat3[][]=new int[row1][col2];
	if (row1==col2) {
		System.out.print("Enter elements of Matrix 1\n");
	for (i=0;i<row1;i++) {
		for(j=0;j<col1;j++) {
				mat1[i][j]=scan.nextInt();
		}
	}
	System.out.print("Enter elements of Matrix 2\n");
	for (i=0;i<row2;i++) {
		for(j=0;j<col2;j++) {
			mat2[i][j]=scan.nextInt();
		}
	}
	for (i=0;i<row1;i++) {
		for(j=0;j<col2;j++) {
			for(k=0;k<col1;k++) {
					mat3[i][j]=mat1[i][k]*mat2[k][j];
			}
		}
	}
	
	System.out.print("The product of 2 matrices is:\n");
	for(i=0;i<row1;i++) {
		for(j=0;j<col2;j++) {
			System.out.print("\t");
			System.out.print(++mat3[i][j]);
		}
		System.out.print("\n");
		}
	}
	else {
	System.out.print("Product cannot be found; Matrix order error");
	}
}
}
