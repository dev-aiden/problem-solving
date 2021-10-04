#include <iostream>

using namespace std;

long long d[93];

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    d[1] = d[2] = 1;
    for (int i = 3; i <= n; ++i) d[i] = d[i - 2] + d[i - 1];
    cout << d[n] << "\n";
    return 0;
}
