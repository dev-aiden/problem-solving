#include <iostream>

using namespace std;

int d[33];

int solve(int n) {
    if (n == 0) return 1;
    if (n % 2) return 0;
    if (d[n] > 0) return d[n];
    d[n] = solve(n - 2) * 3;
    for (int i = n - 4; i >= 0; i -= 2) d[n] += solve(i) * 2;
    return d[n];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    cout << solve(n) << "\n";
    return 0;
}
