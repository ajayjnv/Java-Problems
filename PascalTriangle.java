class PascalTriangle{
    public void printPascal(int n){
        int[] previous=new int[n];
        for(int i=0;i<n;i++){
            int[] current=new int[i+1];
            for(int j=1;j<n-i;j++){
                System.out.print(" ") ;
            }
            for(int k=0;k<=i;k++){
                if(k==0 || k==i){
                    System.out.print("1 ");
                    current[k]=1;
                }
                else{
                    current[k]=previous[k]+previous[k-1];
                    System.out.print(current[k]+" ");
                }
            }
            System.out.println();
            previous=current;
        }
    }
    public static void main(String[] args) {
        PascalTriangle p1=new PascalTriangle();
        p1.printPascal(10);
    }
}