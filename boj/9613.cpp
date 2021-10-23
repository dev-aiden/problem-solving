#include <iostream>

using namespace std;

int arr[103];

int gcd(int a, int b) {
    while (b != 0) {
        int r = a % b;
        a = b;
        b = r;
    }
    return a;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        int n; cin >> n;
        for (int i = 0; i < n; ++i) cin >> arr[i];
        long long ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                ans += gcd(arr[i], arr[j]);
            }
        }
        cout << ans << "\n";
    }
    return 0;
}
