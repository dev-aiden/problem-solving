#include <iostream>

using namespace std;

int prime[1000003];

int main(void) {
    ios_base::sync_with_stdio(false);
    prime[1] = 1;
    for (int i = 2; i * i<= 1000000; ++i) {
        for (int j = i * i; j <= 1000000; j += i) {
            prime[j] = 1;
        }
    }
    int m, n; cin >> m >> n;
    for (int i = m; i <= n; ++i) {
        if (prime[i] == 0) cout << i << "\n";
    }
    return 0;
}
