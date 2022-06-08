public class NumberOfGoodPairs {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 };
        System.out.println(numberOfGoodPairs(arr));
        System.out.println(numIdenticalPairs(arr));
    }

    static int numberOfGoodPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;
                }
            }
        }

        return count;
    }

    // or going by number of pairs possible with the given number approach
    // first calculate the frequency of each given number
    // find total number of pairs for that particular number
    // add to a counter of number of pairs possible
    // Time Complexity of the code = O(n)
    static int numIdenticalPairs(int[] nums) {
        int ans = 0;

        // create an array containing digits from 1 to 101 to store the frequencies
        int[] arr = new int[101];
        for (int num : nums) {
            arr[num]++;
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            ans += arr[i] * (arr[i] - 1) / 2; // nc2
        }

        return ans;
    }
}
