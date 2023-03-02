public class Question4 {

    public static void main(String[] args)
    {
        int[][] mat = {{1 , 2, 3, 4 ,5} , { 6 , 7, 8 ,9 ,10} , { 11 ,12 , 13 ,14 , 15}};
        int r = mat.length;
        int c = mat[0].length;
        //int sum =0;

        for(int i =0 ; i<r ; i++)
        {
            int sum =0;
            for(int j =0 ; j<c ; j++)
            {
                sum = sum+mat[i][j];
            }
            System.out.println("The sum of " + (i+1 )+ " row is = " + sum );
        }

        for(int i =0 ; i<c ; i++)
        {
            int sum =0;
            for(int j =0 ; j<r ; j++)
            {
                sum = sum+mat[j][i];
            }
            System.out.println("The sum of " + (i+1 )+ " column is = " + sum );
        }

    }
}
