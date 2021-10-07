#include <iostream>
#include <algorithm>

using namespace std;

int d[100003][3];
int arr[100003][2];

int solve(int n, int a) {
    if (n == 0) return 0;
    if (d[n][a] != -1) return d[n][a];
    if (a == 0) d[n][a] = max(max(solve(n - 1, 0), solve(n - 1, 1)), solve(n - 1, 2));
    else if (a == 1) d[n][a] = max(solve(n - 1, 0), solve(n - 1, 2)) + arr[n][1];
    else if (a == 2) d[n][a] = max(solve(n - 1, 0), solve(n - 1, 1)) + arr[n][0];
    return d[n][a];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        for (int i = 0; i <= 100000; ++i) {
            for (int j = 0; j < 3; ++j) d[i][j] = -1;
        }
        int n; cin >> n;
        for (int i = 0; i < 2; ++i) {
            for (int j = 1; j <= n; ++j) cin >> arr[j][i];
        }
        cout << max(max(solve(n, 0), solve(n, 1)), solve(n, 2)) << "\n";
    }
    return 0;
}
