#include <iostream>

using namespace std;

int d[103][13];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i < 10; ++i) d[1][i] = 1;
    for (int i = 2; i <= n; ++i) {
        for (int j = 0; j <= 9; ++j) {
            if (j - 1 >= 0) d[i][j] += d[i - 1][j - 1];
            if (j + 1 <= 9) d[i][j] += d[i - 1][j + 1];
            d[i][j] %= 1000000000;
        }
    }
    int result = 0;
    for (int i = 0; i <= 9; ++i) {
        result += d[n][i];
        result %= 1000000000;
    }
    cout << result << "\n";
    return 0;
}
