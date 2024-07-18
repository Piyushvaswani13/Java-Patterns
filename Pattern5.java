class Pattern5 {
    public static void main(String[] args) {
        int n = 9; 

        for (int i = 9; i >= 1; i--) {
            
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
           
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            
            for (int j = n - 1; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

