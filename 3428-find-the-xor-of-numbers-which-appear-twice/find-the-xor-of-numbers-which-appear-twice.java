class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int result = 0;

        for (int num : nums) {

            if (seen.contains(num)) {
                result ^= num;   // second occurrence
            } else {
                seen.add(num);
            }
        }

        return result;
    }
}