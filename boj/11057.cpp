#include <iostream>

using namespace std;

int d[1003][13];

int solve(int n, int a) {
    if (n == 1) return 1;
    if (d[n][a] > 0) return d[n][a];
    for (int i = 0; i <= a; ++i) {
        d[n][a] += solve(n - 1, i);
        d[n][a] %= 10007;
    }
    return d[n][a];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int ans = 0;
    for (int i = 0; i < 10; ++i) {
        ans += solve(n, i);
        ans %= 10007;
    }
    cout << ans << "\n";
    return 0;
}
