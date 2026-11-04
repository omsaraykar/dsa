#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using pii = pair<int, int>;
using vi = vector<int>;
using vll = vector<ll>;

#define all(x) (x).begin(), (x).end()
#define sz(x) (int)(x).size()
#define pb push_back
#define rep(i, a, b) for (int i = (a); i < (b); i++)
#define has(b, a) ((b).find(a) != string::npos)
#define maxpq(t) priority_queue<t>
#define minpq(t) priority_queue<t, vector<t>, greater<t>>

const int MOD = 1e9 + 7;
const ll INF = 1e18;

void solve() {
    int n;
    string s;
    cin >> n >> s;

    if (s[n - 1] == '0') {
        cout << count(all(s), '1') << "\n";
        return;
    }

    int rightZero = count(all(s), '0');
    int leftOne = 0;
    int best = rightZero;

    rep(k, 1, n) {
        if (s[k - 1] == '1') leftOne++;
        else rightZero--;
        best = min(best, leftOne + rightZero);
    }
    cout << best << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
}