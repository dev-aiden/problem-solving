#include <iostream>

using namespace std;

int d[13];

int solve(int num) {
    if (num == 1) return 1;
    else if (num == 2) return 2;
    else if (num == 3) return 4;
    if (d[num] > 0) return d[num];
    return d[num] = solve(num - 3) + solve(num - 2) + solve(num - 1);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        int n; cin >> n;
        cout << solve(n) << "\n";
    }
    return 0;
}
