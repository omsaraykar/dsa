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
    vector<int> arr(n+1);

    for(int i=1; i<=n; i++) {
        cin >> arr[i];
    }
    vector<int> f(n+1);
    int mex = 0;
    unordered_set<int> s;


    for(int i=1; i<=n; i++) {
        s.insert(arr[i]);
        while(s.count(mex)) mex++;
        f[i] = mex;
    }

    int mx = INT_MIN, mxIdx = -1;
    for(int i=1; i<=n-k+1; i++) {
        if(mx < arr[i]) {
            mx = arr[i];
            mxIdx = i;
        }
    }
    int mn = INT_MAX, mnIdx = n;
    for(int i=n-k+2; i<=n; i++) {
        if(mn > arr[i]) {
            mn = arr[i];
            mnIdx = i;
        }
    }

    if(mx < mn) {
        cout << -1 << '\n';
        return;
    }

    swap(arr[mnIdx], arr[mxIdx]);

    int prior = f[n-k+1];
    s.clear();
    mex = 0;

    for(int i=1; i<=n; i++) {
        s.insert(arr[i]);
        while(s.count(mex)) mex++;
        f[i] = mex;
    }
    if(prior == f[n-k+1]) {
        cout << -1 << '\n';
        return;
    }
    cout << mnIdx << " " << mxIdx << '\n';
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t = 1;
    cin >> t;
    while (t--) solve();
    return 0;
}