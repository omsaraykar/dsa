#include <bits/stdc++.h>
using namespace std;

class SegmentTree {
    vector<int> tree;
    int n;

private:
    void build(vector<int>& arr, int idx, int l, int r) {
        if (l == r) {
            tree[idx] = arr[l];
            return;
        }

        int mid = (l+r)/2;
        build(arr, 2*idx+1, l, mid);
        build(arr, 2*idx+2, mid+1, r);

        tree[idx] = min(tree[2*idx+1], tree[2*idx+2]);
    }

    int query(int idx, int l, int r, int ql, int qr) {
        if (ql > r || qr < l) return INT_MAX;
        if (ql <= l && r <= qr) return tree[idx];

        int mid = (l+r)/2;
        int leftSide = query(2*idx+1, l, mid, ql, qr);
        int rightSide = query(2*idx+2, mid+1, r, ql, qr);

        return min(leftSide, rightSide);
    }

    void update(int idx, int l, int r, int pos, int val) {
        if (l == r) {
            tree[idx] = val;
            return;
        }

        int mid = (l+r)/2;
        if (pos <= mid) update(2*idx+1, l, mid, pos, val);
        else update(2*idx+2, mid+1, r, pos, val);

        tree[idx] = min(tree[2*idx+1], tree[2*idx+2]);
    }

public:
    SegmentTree(vector<int>& arr) {
        n = arr.size();
        tree.resize(4*n);
        build(arr, 0, 0, n - 1);
    }

    void setElement(int pos, int val) {
        update(0, 0, n - 1, pos, val);
    }

    int getMinimum(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }
};

int main() {
    // ios::sync_with_stdio(false);
    // cin.tie(nullptr);

    int n, q;
    cin >> n >> q;

    vector<int> arr(n);
    for (int i = 0; i < n; i++) cin >> arr[i];
    SegmentTree st(arr);

    while (q--) {
        int type, ans;
        cin >> type;

        if (type == 1) {
            int pos, val;
            cin >> pos >> val;
            st.setElement(pos, val);
        }
        else {
            int l, r;
            cin >> l >> r;
            ans = st.getMinimum(l, r - 1);
            cout << ans << "\n";
        }
    }

    return 0;
}