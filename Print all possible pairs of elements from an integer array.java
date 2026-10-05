public class fun {
    public static void main(String[] arg){
        int arr[]={1,2,3,4,5};
        int target=7;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.println(arr[i]+","+arr[j]);
            }
        }
    }
}
