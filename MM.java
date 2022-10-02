import java .util.Scanner;
public class MM 
{
    public static void main(String[] args) 
    {
        int i,j,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=sc.nextInt();

        System.out.println("Enter the no of coloumns");
        int c=sc.nextInt();

        int[][] A=new int[50][50];
        System.out.println("Enter the matrix");
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                A[i][j]=sc.nextInt();

            }
        }
        int[][] B=new int[50][50];
        System.out.println("Enter the second matrix");
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                B[i][j]=sc.nextInt();

            }
        }
        int[][] C=new int[50][50];
        System.out.println("Multiplicaton of matrix is");
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
               C[i][j]=0;
               for( k=1;k<=c;k++)
               {
                C[i][j] +=A[i][k]*B[k][j];
               }    
            }
        
        }
       
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                System.out.print("\t"+C[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
