#include <iostream>

using namespace std;

int a[1003], d[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int ans = 0;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i]; d[i] = 1;
        for (int j = 1; j < i; ++j) {
            if (a[i] < a[j] && d[i] < d[j] + 1) d[i] = d[j] + 1;
        }
        if (ans < d[i]) ans = d[i];
    }
    cout << ans << "\n";
    return 0;
}
