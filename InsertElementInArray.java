class InsertElementInArray {
    public static void main(String... args) {
        int[] arr = {1, 2, 3, 4, 5};
        

        int n = arr.length;
        int del = 3;
        
        int pos = findEle(arr, n, del);
        if (pos != -1) {
            System.out.print("Original Array: ");
            display(arr);
            n = deleteEle(arr, n, pos);
            System.out.print("Array afte deletion: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        
        } else {
            System.out.println("Element not found");
        }

    }

        

    public static int findEle(int[] arr, int n, int del) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == del) {
                return i;
            }
        }
        return -1;
    }

    public static int deleteEle(int[] arr, int n, int pos) {
        for (int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static void display(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}

