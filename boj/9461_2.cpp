#include <iostream>

using namespace std;

long long d[103];

int main(void) {
    ios_base::sync_with_stdio(false);
    d[1] = d[2] = d[3] = 1; d[4] = d[5] = 2;
    for (int i = 6; i <= 100; ++i) d[i] = d[i - 5] + d[i - 1];
    int t; for (cin >> t; t--;) {
        int n; cin >> n;
        cout << d[n] << "\n";
    }
    return 0;
}
