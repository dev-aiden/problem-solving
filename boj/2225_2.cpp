#include <iostream>

using namespace std;

long long d[203][203];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n, k; cin >> n >> k;
    d[0][0] = 1LL;
    for (int i = 1; i <= k; ++i) {
        for (int j = 0; j <= n; ++j) {
            for (int l = 0; l <= j; ++l) {
                d[i][j] += d[i - 1][j - l];
                d[i][j] %= 1000000000;
            }
        }
    }
    cout << d[k][n] << "\n";
    return 0;
}
