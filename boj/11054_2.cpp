#include <iostream>

using namespace std;

int a[1003], d1[1003], d2[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i]; d1[i] = 1;
        for (int j = 1; j < i; ++j) {
            if (a[j] < a[i] && d1[i] < d1[j] + 1) d1[i] = d1[j] + 1;
        }
    }
    int ans = 0;
    for (int i = n; i >= 1; --i) {
        d2[i] = 1;
        for (int j = n; j > i; --j) {
            if (a[j] < a[i] && d2[i] < d2[j] + 1) d2[i] = d2[j] + 1;
        }
        int temp = d1[i] + d2[i] - 1;
        if (ans < temp) ans = temp;
    }
    cout << ans << "\n";
    return 0;
}
