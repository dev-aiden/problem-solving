#include <iostream>

using namespace std;

long long d[103];

long long solve(int n) {
    if (n <= 3) return 1;
    if (n <= 5) return 2;
    if (d[n] > 0) return d[n];
    return d[n] = solve(n - 5) + solve(n - 1);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        int n; cin >> n;
        cout << solve(n) << "\n";
    }
    return 0;
}
