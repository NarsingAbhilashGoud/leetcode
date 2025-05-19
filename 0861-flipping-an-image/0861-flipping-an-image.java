class Solution {
    static void reverse(int i, int[] arr, int n){
        while(i<=n) {
        int temp = arr[i];
        arr[i] = arr[n];
        arr[n] = temp; 
        i++;
        n--;
        }
    } public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length, m = image[0].length;
        for(int i=0;i<n;i++){
            int k = image[i].length;
            reverse(0,image[i],k-1);
            for(int j=0;j<m;j++){
                if(image[i][j] == 1) image[i][j] =0;
                else image[i][j] =1;  
            }}return image;
    }}