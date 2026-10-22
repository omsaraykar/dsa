#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    vector<long long> sumOfThree(long long num) {
        // 2177. Find Three Consecutive Integers That Sum to a Given Number
        if (num % 3 == 0) {
            long long a = num / 3 - 1;
            long long b = num / 3;
            long long c = num / 3 + 1;
            return {a, b, c};
        }
        return {};
    }
};