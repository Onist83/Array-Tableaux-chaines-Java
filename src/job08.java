public class job08 {
    public static void main(String[] args) {

        int[] arr = {84, 12, 1, 43, 5, 0};

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                continue;
            } else {

                if (arr[i] > arr[i + 1]) {
                    int value = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = value;
                //    if (arr[i] >= arr[i] + 1 && arr[i] <= arr[i] + 2) ;
                }
            }

        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
/*Correction
int[] arr = {84, 12, 1, 43, 5, 0};
    for (int i = 0; i < arr.length-1; i++) {
    if (arr[j] = 0; j < arr.length-1-i; j++) {
    if (arr[j] > arr[j + 1]) {
    int temp = arr[j];
    arr[j] = arr[j + 1];
    arr[j + 1] = temp;
*/




//[0]>
//[5]<

/* int [] arr = new int[6]
arr[0] = 84
arr[1] = 12
arr[2] = 1
arr[3] = 43
arr[4] = 5
arr[5] = 0


 if i=[0]<[1]&&[1]<[2]&&[2]<[3]&&[3]<[4]&&[4]<[5]&&[5]<[6]
        }System.out.print(i);



*/