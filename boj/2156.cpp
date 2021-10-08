#include <iostream>

using namespace std;

int d[10003][3];
int arr[10003];

int solve(int n, int a) {
    if (n == 0) return 0;
    if (d[n][a] != -1) return d[n][a];
    if (a == 0) d[n][a] = max(max(solve(n - 1, 0), solve(n - 1, 1)), solve(n - 1, 2));
    else if (a == 1) d[n][a] = solve(n - 1, 0) + arr[n];
    else if (a == 2) d[n][a] = solve(n - 1, 1) + arr[n];
    return d[n][a];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) {
        for (int j = 0; j < 3; ++j) d[i][j] = -1;
        cin >> arr[i];
    }
    for (int i = 0; i < 3; ++i) solve(n, i);
    cout << max(max(d[n][0], d[n][1]), d[n][2]) << "\n";
	return 0;
}
