#include <bits/stdc++.h>
using namespace std;

vector<int> nums;
vector<int> dp;
vector<vector<int>> parent;
vector<int> path;

void printAll(int i) {
    path.push_back(nums[i]);

    if (parent[i].empty()) {
        vector<int> lis = path;
        reverse(lis.begin(), lis.end());

        for (int x : lis) {
            cout << x << " ";
        }
        cout << "\n";
    } else {
        for (int p : parent[i]) {
            printAll(p);
        }
    }

    path.pop_back();
}

int main() {
    nums = {10,9,2,5,3,7,101,18};

    int n = nums.size();

    dp.assign(n, 1);
    parent.resize(n);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < i; j++) {
            if (nums[j] < nums[i]) {
                if (dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    parent[i].clear();
                    parent[i].push_back(j);
                } else if (dp[j] + 1 == dp[i]) {
                    parent[i].push_back(j);
                }
            }
        }
    }

    int lisLength = *max_element(dp.begin(), dp.end());

    for (int i = 0; i < n; i++) {
        if (dp[i] == lisLength) {
            printAll(i);
        }
    }

    return 0;
}