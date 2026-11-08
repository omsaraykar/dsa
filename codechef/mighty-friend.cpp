#include <bits/stdc++.h>
using namespace std;

using ll = long long;
using pii = pair<int, int>;
using vi = vector<int>;
using vll = vector<ll>;

#define all(x) (x).begin(), (x).end()
#define rall(x) (x).rbegin(), (x).rend()
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

    vi motu, tomu;

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;

        if (i % 2 == 0) motu.push_back(x);
        else tomu.push_back(x);
    }

    sort(motu.rbegin(), motu.rend());
    sort(tomu.begin(), tomu.end());

    int swaps = min(k, (int)tomu.size());

    for (int i = 0; i < swaps; i++) {
        if (motu[i] > tomu[i]) swap(motu[i], tomu[i]);
        else break;
    }

    ll motuScore = accumulate(motu.begin(), motu.end(), 0LL);
    ll tomuScore = accumulate(tomu.begin(), tomu.end(), 0LL);

    cout << (tomuScore > motuScore ? "YES" : "NO") << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}