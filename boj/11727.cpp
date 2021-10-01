#include <iostream>

using namespace std;

int d[1003];

int solve(int num) {
    if (num < 2) return 1;
    if (d[num] != 0) return d[num];
    return d[num] = (solve(num - 2) * 2 + solve(num - 1)) % 10007;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    cout << solve(n) << "\n";
    return 0;
}
