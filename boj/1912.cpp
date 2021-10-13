#include <iostream>
#include <algorithm>

using namespace std;

int a[100003], d[100003];

int solve(int n) {
    if (d[n] != -2147483648) return d[n];
    return d[n] = max(solve(n - 1) + a[n], a[n]);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int ans;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i];
        if (i == 1) {
            ans = d[1] = a[1];
            continue;
        }
        d[i] = -2147483648;
        solve(i);
        if (ans < d[i]) ans = d[i];
    }
    cout << ans << "\n";
    return 0;
}
