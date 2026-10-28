#include <bits/stdc++.h>
using namespace std;

const int B = 19;

struct Node {
    int ch[2] = {-1, -1};
    priority_queue<pair<int, int>> pq;
};

struct Trie {
    vector<Node> tr;

    Trie() {
        tr.emplace_back();
    }

    void insert(int val, int idx) {
        int u = 0;
        tr[u].pq.push({val, idx});

        for (int b = B; b >= 0; b--) {
            int bit = (val >> b) & 1;

            if (tr[u].ch[bit] == -1) {
                tr[u].ch[bit] = (int)tr.size();
                tr.emplace_back();
            }

            u = tr[u].ch[bit];
            tr[u].pq.push({val, idx});
        }
    }

    pair<int, int> best(int u, int cutoff) {
        if (u == -1) return {-1, -1};

        while (!tr[u].pq.empty() &&
               tr[u].pq.top().second <= cutoff) {
            tr[u].pq.pop();
        }

        if (tr[u].pq.empty()) return {-1, -1};

        return tr[u].pq.top();
    }

    // Find index idx such that:
    // a[idx] > x and (a[idx] XOR p) < lim
    // Only indices greater than cutoff are allowed.
    int query(int p, int lim, int x, int cutoff) {
        int u = 0;

        for (int b = B; b >= 0; b--) {
            int pb = (p >> b) & 1;
            int lb = (lim >> b) & 1;

            if (lb == 1) {
                // XOR bit 0 makes the XOR strictly smaller here.
                int v = tr[u].ch[pb];

                if (v != -1) {
                    auto res = best(v, cutoff);

                    if (res.first > x)
                        return res.second;
                }

                // Continue with an equal XOR prefix.
                u = tr[u].ch[pb ^ 1];
            } else {
                // XOR bit must be 0 to remain below lim.
                u = tr[u].ch[pb];
            }

            if (u == -1) return -1;
        }

        // XOR equal to lim is not allowed.
        return -1;
    }
};

void solve() {
    int n;
    cin >> n;

    vector<int> a(n);
    for (int &v : a) cin >> v;

    Trie pref, suff;

    // Initially, the suffix contains every index.
    for (int i = 0; i < n; i++)
        suff.insert(a[i], i);

    // For j = 1, the prefix contains only index 0.
    pref.insert(a[0], 0);

    for (int j = 1; j < n - 2; j++) {
        for (int k = j + 1; k < n - 1; k++) {
            int x = a[j] ^ a[k];

            int i = pref.query(a[j], a[k], x, -1);

            if (i == -1) continue;

            // Only indices l > k are allowed.
            int l = suff.query(a[k], a[j], x, k);

            if (l != -1) {
                cout << i + 1 << " " << j + 1 << " "
                     << k + 1 << " " << l + 1 << '\n';
                return;
            }
        }

        // Add index j to the prefix for the next iteration.
        pref.insert(a[j], j);
    }

    cout << -1 << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) solve();
}
