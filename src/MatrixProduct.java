import java.util.Scanner;

public class MatrixProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        int b = sc.nextInt();
        caculateMatrix(array,n,b);
        for(int element[] : array)
        {
            for(int x : element)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
    public static void caculateMatrix(int[][] array,int n,int b)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j] = array[i][j] * b;
            }
        }
    }
}
