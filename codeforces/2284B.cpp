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
    int n, k;
    cin >> n >> k;

    vll a(n);
    for (auto &x : a) cin >> x;
    sort(all(a));

    int c = 0;
    for (ll x : a) {
        if (x == a[n - 1]) c++;
    }

    if (k < c) {
        cout << "NO\n";
        return;
    }

    cout << "YES\n";
    for (int i = n - k; i < n; i++) cout << a[i] << " ";
    for (int i = n - k - 1; i >= 0; i--) cout << a[i] << " ";
    cout << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}
