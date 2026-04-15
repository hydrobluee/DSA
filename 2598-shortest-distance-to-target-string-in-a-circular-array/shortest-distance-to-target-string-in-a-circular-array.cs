public class Solution {
    public int ClosestTarget(string[] words, string target, int start) {
        int n = words.Length;
        for (int i = 0; i <= (n >> 1); i++)
            if (words[(start + i) % n] == target ||
                words[(start - i + n) % n] == target)
                return i;

        return -1;
    }
}