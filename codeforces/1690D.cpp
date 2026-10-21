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
    string s;
    cin >> n >> k;
    cin >> s;
    

    int j = 0;
    int count = 0;
    while (j < k) {
        if (s[j] == 'W') count++;
        j++;
    }

    int ans = count;
    int i = 0;

    while (j < n) {
        if (s[j] == 'W') count++;
        if (s[i] == 'W') count--; 
        ans = min(ans, count);
        i++;
        j++;
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