import java.util.*;

class Solution
{
    public void antidiagonals(int[][] array,int r,int c)
    {
        for (int x = 0; x < c; x++)
        {
            int i = 0;
            int j = x;
            while (i < r&& j >= 0)
            {
                System.out.print(array[i][j] + " ");
                i++;
                j--;
            }
            for (int k = c - 1; k > x; k--)
            {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
        for (int x = 1; x < r; x++)
        {
            int i = x, j = c- 1;
            while (i < r && j >= 0)
            {
                System.out.print(array[i][j] + " ");
                i++;
                j--;
            }
            for (int k = r - 1; k >x ; k--)
            {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}

class AntiDiagonals
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();
        int columns=scanner.nextInt();
        int[][] array=new int[rows][columns];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<columns;j++)
            {
                array[i][j]=scanner.nextInt();
            }
        }
        Solution solution =new Solution();
        solution.antidiagonals(array,rows,columns);
    }
}
