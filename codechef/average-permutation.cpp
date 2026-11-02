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

    if (n == 3) {
        for (int i = 0; i < n; i++) {
            cout << i + 1<< " ";
        }
        cout << '\n';
        return;
    }

    vi a(n);
    
    a[n - 1] = n;
    a[0] = n - 1;
    a[1] = n - 2;
    a[n - 2] = n - 3;

    for (int i = 2; i < n - 2; i++) {
        a[i] = i - 1;
    }

    for (int i = 0; i < n; i++) {
        cout << a[i] << " ";
    }
    
    cout << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}