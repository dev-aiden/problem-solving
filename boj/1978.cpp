#include <iostream>

using namespace std;

int prime[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    prime[1] = 1;
    for (int i = 2; i <= 1000; ++i) {
        for (int j = i * i; j <= 1000; j += i) {
            prime[j] = 1;
        }
    }
    int ans = 0;
    int n; for (cin >> n; n--;) {
        int num; cin >> num;
        if (prime[num] == 0) ++ans;
    }
    cout << ans << "\n";
    return 0;
}
