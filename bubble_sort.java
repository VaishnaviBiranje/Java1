class bubble_sort{

    static void printarr(int arr[]){
             for(int i=0;i<arr.length;i++){
            
                System.out.println(arr[i]);
            
        }
    }
    public static void main(String args[]){
        int arr[] = {6,8,3,5,9,4};
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        printarr(arr);
        

        
    }
}