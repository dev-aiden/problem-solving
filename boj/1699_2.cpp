#include <iostream>

using namespace std;

int a[100003], d[100003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    for (int i = 1; i <= n; ++i) {
        d[i] = i;
        for (int j = 1; j * j <= i; ++j) {
            if (d[i] > d[i - j * j] + 1) {
                d[i] = d[i - j * j] + 1;
            }
        }
    }
    cout << d[n] << "\n";
    return 0;
}
