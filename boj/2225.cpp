#include <iostream>

using namespace std;

long long d[203][203];

long long solve(int k, int n) {
    if (k == 1) return 1LL;
    if (d[k][n] > 0) return d[k][n];
    for (int i = 0; i <= n; ++i) {
        d[k][n] += solve(k - 1, i);
        d[k][n] %= 1000000000;
    }
    return d[k][n];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n, k; cin >> n >> k;
    cout << solve(k, n) << "\n";
    return 0;
}
