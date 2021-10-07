#include <iostream>
#include <algorithm>

using namespace std;

int d[100003][3];
int arr[100003][2];

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        int n; cin >> n;
        for (int i = 0; i < 2; ++i) {
            for (int j = 1; j <= n; ++j) cin >> arr[j][i];
        }
        for (int i = 1; i <= n; ++i) {
            d[i][0] = max(max(d[i - 1][0], d[i - 1][1]), d[i - 1][2]);
            d[i][1] = max(d[i - 1][0], d[i - 1][2]) + arr[i][1];
            d[i][2] = max(d[i - 1][0], d[i - 1][1]) + arr[i][0];
        }
        cout << max(max(d[n][0], d[n][1]), d[n][2]) << "\n";
    }
    return 0;
}
