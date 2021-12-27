#include <iostream>

using namespace std;

int arr[20][20];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    for (int i = 1; i <= 14; ++i) arr[0][i] = i;
    for (int i = 1; i <= 14; ++i) {
        arr[i][1] = 1;
        for (int j = 2; j <= 14; ++j) {
            arr[i][j] = arr[i][j - 1] + arr[i - 1][j];
        }
    }
    int t; for (cin >> t; t--;) {
        int k, n; cin >> k >> n;
        cout << arr[k][n] << "\n";
    }
    return 0;
}
