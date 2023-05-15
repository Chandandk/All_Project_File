class BinarySearch {
    public  static int binarySearch(int arr[], int tar)
    {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (tar== arr[mid]) {
                return mid;
            }

            else if (tar<arr[mid]) {
                end = mid - 1;
            }

            else {
                st = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = { 2, 3, 4, 10, 40 }; int tar = 40;
        BinarySearch bs = new BinarySearch(); // create an object for binarysearch

        //int n = arr.length;
        int result = bs.binarySearch(arr, tar);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at "
                    + "index " + result);
    }
}