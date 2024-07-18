class Pattern1 
{
    public static void main(String[] args) 
    {
        
       int i,j,k;
       int n = 9;
       for(i=1;i<=n;i++)
       {
          for ( k = n; k >i; k--) 
          {
                System.out.print(" ");
            }
           for(j=1;j<=i;j++)
           {
              System.out.print( i+" ");  
           }
            System.out.println();
       }
    }
}

