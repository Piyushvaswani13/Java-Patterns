
class Pattern3 
{
    public static void main(String[] args) 
    {
        
       int i,j,k;
       int n = 9;
       for(i=n;i>=1;i--)
       {
           for ( k = 1; k < i; k++) 
           {
                System.out.print(" ");
            }
           for(j=n;j>=i;j--)
           {
              System.out.print( "* ");  
           }
            System.out.println();
       }
    }
}
