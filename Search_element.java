public class Search_element {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,8};
        int x = 12;
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println("element are found at index "+ans);
    }
}
