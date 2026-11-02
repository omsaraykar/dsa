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
#define pii pair<int,int>

const int MOD = 1e9 + 7;
const ll INF = 1e18;

void solve() {
    int n;
    cin >> n;
    vi a(n);
    for (auto &x : a) cin >> x;

    ll s = 0;
    for (int x : a) s += x;

    bool interior = false;
    rep(i, 1, n - 1) if (a[i] >= 2) interior = true;

    if (n == 2) {
        if (a[0] >= 2 || a[1] >= 2) cout << s - 1 << "\n";
        else cout << -1 << "\n";
    } else if (interior) {
        cout << s - 1 << "\n";
    } else if (a[0] >= 2 || a[n - 1] >= 2) {
        cout << s - (n - 1) << "\n";
    } else {
        cout << -1 << "\n";
    }
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}