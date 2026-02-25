public class MinMaxElemene {
    static int[] minMax(int[] arr, int i){
        if(i==arr.length){
            int res[] = new int[2];
            res[0]=Integer.MIN_VALUE;
            res[1]=Integer.MAX_VALUE;
            return res;
        }
        int res[]=minMax(arr,i+1);
        if(arr[i]>res[0]) res[0]=arr[i];
        if(arr[i]<res[1]) res[1]=arr[i];
        return res;
    }
    public static void main(String[] args) {
        int[] arr={12,4,87,21,-384,21,54,35};
        int res[]=minMax(arr,0);
        System.out.println("Max-> "+res[0]+"\nMin-> "+res[1]);
    }
}
