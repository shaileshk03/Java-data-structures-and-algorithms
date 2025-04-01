package CODO_DOJO;

import java.util.List;

/**
 * @author Shailesh
 */
public class CheckPerfectSquare {
        public static boolean isPerfectSquare(int number, List<Integer> elements) {
            int left = 0;
            int right = elements.size() - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midValue = elements.get(mid);

                if (midValue == number) {
                    return true;
                } else if (midValue < number) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
 

    public static boolean perfectSquareCheck(int n) {
        if (n <= 1) {
            return true;
        }
        int left = 1;
        int right = n;

        while (left <= right) {
            // Get the middle value
            int mid = left + (right - left) / 2;

            // Calculate square of the middle value
            int square = mid * mid;

            // It is perfect If the square matches with n,
            if (square == n) {
                System.out.println(true);
                return true;
            }
            // If the square is smaller than n, search the right,
            else if (square < n) {
                left = mid + 1;
            }
            // If the square is larger than n, search the left
            else {
                right = mid - 1;
            }
        }
        // if not found anything than n is not a perfect square
        System.out.println(false);
        return false;
    }

    public static void main(String[] args) {
        perfectSquareCheck(4);
    }

}
