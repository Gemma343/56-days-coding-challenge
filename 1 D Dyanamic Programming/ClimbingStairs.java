class ClimbingStairs {
    public int climbStairs(int n) {
        // Base cases: 1 step for n=1 and 2 steps for n=2
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }

        // Number of ways to reach the nth step depends on the number of ways to reach the (n-1)th and (n-2)th steps
        int firstStep = climbStairs(n - 1);
        int secondStep = climbStairs(n - 2);

        // You can either take 1 step from the (n-1)th step or 2 steps from the (n-2)th step
        return firstStep + secondStep;
    }
}

