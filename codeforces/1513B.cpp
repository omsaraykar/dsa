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

const int MOD = 1e9 + 7;
const ll INF = 1e18;

void solve() {
    int m, n;
    cin >> m >> n;

    int x1 = m, y1 = 1;
    int x2 = 1, y2 = n;

    cout << x1 << " " <<  y1 << " " << x2 << " " << y2 << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}