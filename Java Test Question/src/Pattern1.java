class Pattern1 {
  public static void main(String[] args) {
    int n=5;
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("*");
      }
      System.out.println();
      if(i<n)
      for(int p=1;p<=i;p++){
        System.out.print(" ");
      }
    }
  int c=n-1;

    for(int k=1;k<=c;k++)
    {
      for(int p=k;p<c;p++){
        System.out.print(" ");
      }

      for(int l=k;l<=c;l++)
      {
         System.out.print("*"); 
      }
      System.out.println();
    }



  }
}