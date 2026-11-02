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
    int n, m;
    string p, q;
    cin >> n >> m >> p >> q;

    int c[26] = {};
    for (char ch : p) c[ch - 'a']++;
    for (char ch : q) c[ch - 'a']--;

    int want[26] = {};
    want['s' - 'a'] = want['i' - 'a'] = want['x' - 'a'] = 1;

    bool ok = true;
    rep(i, 0, 26) if (c[i] != want[i]) ok = false;

    cout << (ok ? "YES" : "NO") << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}