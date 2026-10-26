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

    int count = 0;
    for (auto &x : a) {
        cin >> x;
        count += (x == 2);
    }

    if (count & 1) {
        cout << -1 << '\n';
        return;
    }

    int cnt = 0;
    for (int i = 0; i < n - 1; i++) {
        cnt += (a[i] == 2);
        if (cnt == count / 2) {
            cout << i + 1 << '\n';
            return;
        }
    }

    cout << -1 << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}