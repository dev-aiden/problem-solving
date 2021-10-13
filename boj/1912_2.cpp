#include <iostream>
#include <algorithm>

using namespace std;

int a[100003], d[100003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    int ans;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i];
        if (i == 1) {
            ans = d[1] = a[1];
            continue;
        }
        d[i] = max(d[i - 1] + a[i], a[i]);
        if (ans < d[i]) ans = d[i];
    }
    cout << ans << "\n";
    return 0;
}
