#include <iostream>

using namespace std;

int a[303], d[303];

int solve(int n) {
    if (n == 0) return 0;
    if (n <= 2) return a[n - 1] + a[n];
    if (d[n] > 0) return d[n];
    return d[n] = max(solve(n - 2) + a[n], solve(n - 3) + a[n - 1] + a[n]);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) cin >> a[i];
    cout << solve(n) << "\n";
    return 0;
}
