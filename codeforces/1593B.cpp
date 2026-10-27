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
    // a number is divisible by 25 if its last two digits are 00, 25, 50, or 75.
    string s;
    cin >> s;
    
    int ans = INT_MAX;
    int cnt = 0;
    while (s.size() > 0) {
        int i = s.size() - 1;

        if (s[i] == '0') {
            int j = i - 1;
            while (j >= 0 && s[j] != '0' && s[j] != '5') j--;
            if (j >= 0) {
                ans = min(ans, i - j - 1 + cnt);
            }
        }
        else if (s[i] == '5') {
            int j = i - 1;
            while (j >= 0 && s[j] != '2' && s[j] != '7') j--;
            if (j >= 0) ans = min(ans, i - j - 1 + cnt);
        }

        s.erase(s.size() - 1, 1);
        cnt++;
    }

    cout << ans << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}