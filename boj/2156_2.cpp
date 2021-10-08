#include <iostream>

using namespace std;

int d[10003][3];
int arr[10003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) cin >> arr[i];
    for (int i = 1; i <= n; ++i) {
        d[i][0] = max(max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
        d[i][1] = d[i - 1][0] + arr[i];
        d[i][2] = d[i - 1][1] + arr[i];
    }
    cout << max(max(d[n][0], d[n][1]), d[n][2]) << "\n";
    return 0;
}
