class Solution {
public:

    bool isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    bool completePrime(int num) {

        // Check all prefixes
        int temp = num;
        int divisor = 1;

        while (temp >= 10) {
            divisor *= 10;
            temp /= 10;
        }

        int prefix = 0;

        for (int d = divisor; d > 0; d /= 10) {
            prefix = prefix * 10 + (num / d) % 10;

            if (!isPrime(prefix))
                return false;
        }

        // Check all suffixes
        int power = 10;

        while (power <= num) {
            int suffix = num % power;

            if (!isPrime(suffix))
                return false;

            power *= 10;
        }

        return true;
    }
};