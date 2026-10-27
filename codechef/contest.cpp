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

int dfs(int curr, int S) {
    if (curr > S) return 0;
    if (curr == S) return 1;

    int take1 = dfs(curr + 1, S);
    int take2 = dfs(curr + 2, S);

    return take1 + take2;
}

bool dfs(int i, int target, vector<int>& a) {
    if (target == 0) return true;
    if (i == a.size() || target < 0) return false;

    bool take = dfs(i + 1, target - a[i], a);
    bool notTake = dfs(i + 1, target, a);

    return take || notTake;
}

void solve() {
    int n;
    cin >> n;

    vector<int> a(n);
    int sum = 0;

    for (int i = 0; i < n; i++) {
        cin >> a[i];
        sum += a[i];
    }

    if (sum % 2 != 0 || n < 2) {
        cout << "NO\n";
        return;
    }

    if (dfs(0, sum / 2, a)) cout << "YES\n";
    else cout << "NO\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}