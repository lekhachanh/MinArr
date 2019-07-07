public class MinArr {
    public static int minArr(int arr[]) {
        int index = 0;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int arr [] = {23, 45, 67,32, 89, 54, 90, 13};
        int index = minArr(arr);
        System.out.println("gia tri be nhat cua mang la: "+ arr[index] + " o vi tri "+ (index+1));
    }
}
