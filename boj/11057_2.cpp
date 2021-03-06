#include <iostream>

using namespace std;

int d[1003][13];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 0; i < 10; ++i) d[1][i] = 1;
    for (int i = 2; i <= n; ++i) {
        for (int j = 0; j < 10; ++j) {
            for (int k = 0; k <= j; ++k) {
                d[i][j] += d[i - 1][k];
                d[i][j] %= 10007;
            }
        }
    }
    int ans = 0;
    for (int i = 0; i < 10; ++i) {
        ans += d[n][i];
        ans %= 10007;
    }
    cout << ans << "\n";
    return 0;
}
