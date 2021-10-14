#include <iostream>

using namespace std;

int a[303], d[303];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) {
        cin >> a[i];
        if (i <= 2) {
            d[i] = a[i - 1] + a[i];
            continue;
        }
        d[i] = d[i - 2] + a[i];
        int temp = d[i - 3] + a[i - 1] + a[i];
        if (d[i] < temp) d[i] = temp;
    }
    cout << d[n] << "\n";
    return 0;
}
