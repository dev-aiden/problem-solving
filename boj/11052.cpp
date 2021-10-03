#include <iostream>

using namespace std;

int p[1003], d[1003];

int solve(int num) {
    if (num == 1) return p[1];
    if (d[num] != 0) return d[num];
    for (int i = 1; i <= num; ++i) {
        int temp = solve(num - i) + p[i];
        if (d[num] < temp) d[num] = temp;
    }
    return d[num];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) cin >> p[i];
    cout << solve(n) << "\n";
    return 0;
}
