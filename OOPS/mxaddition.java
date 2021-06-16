class mxaddition
{
   public static void main(String args[])
   {
      int a[][]={{1,4,6},{2,5,3},{4,2,5}};
      int b[][]={{3,2,5},{1,4,8},{5,6,7}};
      int c[][]=new int[3][3];
      System.out.println("sum of two matrix are");
      for(int i=0;i<3;i++)
      {
         for(int j=0;j<3;j++)
         {
             c[i][j]=a[i][j]+b[i][j];
             System.out.println(c[i][j]+" ");
         }
         System.out.println();
       }
    }
}