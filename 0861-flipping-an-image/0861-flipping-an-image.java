class Solution {
    static void reverse(int i, int[] arr, int n){
        if(i==n/2) return;
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        reverse(i+1,arr,n); 
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length, m = image[0].length;
        for(int i=0;i<n;i++){
            int k = image[i].length;
            reverse(0,image[i],k);
            for(int j=0;j<m;j++){
                if(image[i][j] == 1) image[i][j] =0;
                else image[i][j] =1;
            
            }
        }return image;
    }
}