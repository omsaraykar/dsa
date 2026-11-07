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

    vi arr(n);
    for (auto &x : arr) cin >> x;

    vi dept(n);
    for (auto &x : dept) cin >> x;
    
    sort(all(arr));
    sort(all(dept));

    int curr = 0;
    int ans = 0;

    int i = 0, j = 0;
    while (i < n && j < n) {
        if (arr[i] < dept[j]) {
            curr++;
            ans = max(ans, curr);
            i++;
        } else {
            curr--;
            j++;
        }
    }

    cout << ans << "\n";
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}