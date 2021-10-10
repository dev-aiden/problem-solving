#include <iostream>

using namespace std;

int d[1003], a[1003];

int solve(int n) {
    if (d[n] > 0) return d[n];
    d[n] = a[n];
    for (int i = n - 1; i >= 1; --i) {
        if (a[n] > a[i] && d[n] < solve(i) + a[n]) d[n] = d[i] + a[n];
    }
    return d[n];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int ans = 0;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i];
        solve(i);
    }
    d[1] = a[1];
    for (int i = 1; i <= n; ++i) if (ans < d[i]) ans = d[i];
    cout << ans << "\n";
    return 0;
}
