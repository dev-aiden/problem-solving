#include <iostream>

using namespace std;

int a[100003], d[100003];

int solve(int n) {
    if (n == 1) return 1;
    if (d[n] > 0) return d[n];
    d[n] = n;
    for (int i = 1; i * i <= n; ++i) {
        if (d[n] > solve(n - i * i) + 1) {
            d[n] = solve(n - i * i) + 1;
        }
    }
    return d[n];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    cout << solve(n) << "\n";
    return 0;
}
