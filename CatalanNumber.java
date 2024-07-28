class CatalanNumber {
    public static int findCatalan(int n) {
        
        
        int[] arr=new int[n+1];
        arr[0]=1;arr[1]=1;

        for(int i=2;i<arr.length;i++){
            for(int j=0;j<i;j++){
                arr[i]+=arr[j]*arr[i-j-1];
            }
        }
        return arr[n];
    }
    public static void main(String args[]){

        System.out.println(findCatalan(4));

    }
}