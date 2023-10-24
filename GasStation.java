/*
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].

You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 */

class GasStation { // T.C:0(n) S.C:0(1)
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost) {
            return -1;
        }
        int remainingGas = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            remainingGas = remainingGas + (gas[i] - cost[i]);
            if (remainingGas < 0) {
                start = i + 1;
                remainingGas = 0;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] gas = { 1, 2, 3, 4, 5 };
        int[] cost = { 3, 4, 5, 1, 2 };
        System.out.println(canCompleteCircuit(gas, cost));
    }
}