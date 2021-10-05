#include <iostream>

using namespace std;

int d[103][13];

int solve(int n, int a) {
    int ret = 0;
    if (n == 1) {
        if (a == 0) return 0;
        else return 1;
    }
    if ((a - 1) >= 0) {
        if (d[n - 1][a - 1] == 0) d[n - 1][a - 1] = solve(n - 1, a - 1);
        ret += d[n - 1][a - 1];
        ret %= 1000000000;
    }
    if ((a + 1) <= 9) {
        if (d[n - 1][a + 1] == 0) d[n - 1][a + 1] = solve(n - 1, a + 1);
        ret += d[n - 1][a + 1];
        ret %= 1000000000;
    }
    return ret;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int result = 0;
    for (int i = 0; i < 10; ++i) {
        result += solve(n, i);
        result %= 1000000000;
    }
    cout << result << "\n";
    return 0;
}
