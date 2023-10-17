class pattern{
    public static void main(String ars[]){
        int n=4,m=4;
        for(int i=0;i<n;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int l=0;l<=i;l++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}