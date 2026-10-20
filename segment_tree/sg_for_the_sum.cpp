#include <bits/stdc++.h>
using namespace std;

typedef long long ll;

class SegmentTree {
private:
    vector<ll> tree;
    int n;

    void build(vector<ll>& arr, int idx, int l, int r) {
        if (l == r) {
            tree[idx] = arr[l];
            return;
        }

        int mid = (l+r)/2;
        build(arr, 2*idx+1, l, mid);
        build(arr, 2*idx+2, mid+1, r);
        tree[idx] = tree[2*idx+1] + tree[2*idx+2];
    }

    ll query(int idx, int l, int r, int ql, int qr) {
        if (ql > r || qr < l) return 0;
        if (ql <= l && r <= qr) return tree[idx];

        int mid = (l+r)/2;
        ll left = query(2*idx+1, l, mid, ql, qr);
        ll right = query(2*idx+2, mid+1, r, ql, qr);

        return left + right;
    }

    void update(int idx, int l, int r, int pos, ll val) {
        if (l == r) {
            tree[idx] = val;
            return;
        }

        int mid = (l+r)/2;
        if (pos <= mid) update(2*idx+1, l, mid, pos, val);
        else update(2*idx+2, mid+1, r, pos, val);
        tree[idx] = tree[2*idx+1] + tree[2*idx+2];
    }

public:
    SegmentTree(vector<ll>& arr) {
        n = arr.size();
        tree.resize(4*n);
        build(arr, 0, 0, n - 1);
    }

    void setElement(int i, ll v) {
        update(0, 0, n - 1, i, v);
    }

    ll sum(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }
};

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, q;
    cin >> n >> q;

    vector<ll> arr(n);
    for (int i = 0; i < n; i++) cin >> arr[i];

    SegmentTree st(arr);

    while (q--) {
        int type;
        cin >> type;

        if (type == 1) {
            int i, v;
            cin >> i >> v;
            st.setElement(i, v);
        }
        else {
            int l, r;
            cin >> l >> r;
            cout << st.sum(l, r - 1) << "\n";
        }
    }

    return 0;
}