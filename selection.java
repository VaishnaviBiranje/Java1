class selection{
    public static void main(String arg[]){
        int arr[] = {45,78,23,12,44};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                   min = j; 
                }

            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i]  = temp;
        }

        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
}