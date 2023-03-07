// My solution
class Solve {
    int[] findTwoElement(int arr[], int n) {
        Arrays.sort(arr);
        int[] ret = new int[2];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i-1] == 0) {
                if(ret[0] <= 0) {
                    ret[0] = arr[i];
                }
            }
            if (arr[i-1] != i && arr[i] != i) {
                if (ret[1] <= 0) {
                    ret[1] = i;
                }
            }
            if (i == arr.length - 1 && arr[i] != arr.length) {
                if (ret[1] <= 0) {
                    ret[1] = arr.length;
                }
            }
        }
        return ret;
    }
}
