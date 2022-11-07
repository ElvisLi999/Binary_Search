public class Main {
    public static int binarySearch(Comparable[ ] array, Comparable target) {

        /* Binary Search Analysis:

            Worst Case - target is not found, log(n) comparisons made
            Best Case - target is right in the middle and is found in 1st comparison
            Average Case - target found after (log(n) / 2) comparisons

            Worst Case = Big O(log(n))
            Best Case = Big O(1)
            Average Case = Big O(log(n) / 2) = Big O(log(n))
        */
        int index;
        int left = 0, right = array.length - 1;

        while(left <= right) {
            // Cut array into 2 parts
            index = (left + right) / 2;

            /*
            返回值是整型，它是先比较对应字符的大小(ASCII码顺序)，如果第一个字符和参数的第一个字符不等，
            结束比较，返回他们之间的长度差值，如果第一个字符和参数的第一个字符相等，则以第二个字符和参数的第二个字符做比较，
            以此类推,直至比较的字符或被比较的字符有一方结束。

            1, 如果参数字符串等于此字符串，则返回值 0；
            2, 如果此字符串小于字符串参数，则返回一个小于 0 的值；
            3, 如果此字符串大于字符串参数，则返回一个大于 0 的值。
            */
            // if target = mid, then return mid
            if(target.compareTo(array[index]) == 0) {
                return index;
            }
            // if target > mid, then left = mid + 1
            if(target.compareTo(array[index]) > 0) {
                // Continue search in right half of array
                left = index + 1;
            } else {
                // if target < mid, then right = mid - 1
                // Continue search in left half of array
                right = index - 1;
            } // end if

        } // end while loop

        return -1; // target not found
    } // end binarySearch

    public static void main(String[] args) {
	// write your code here
        Comparable[] arr =  {10, 20, 30, 40, 60, 110, 120, 130, 170};
        int t = 110;
        System.out.println(binarySearch(arr,t));
    }
}
