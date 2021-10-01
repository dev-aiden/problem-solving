#include <iostream>

using namespace std;

int d[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    d[0] = d[1] = 1;
    for (int i = 2; i <= n; ++i) d[i] = (d[i - 2] * 2 + d[i - 1]) % 10007;
    cout << d[n] << "\n";
    return 0;
}
