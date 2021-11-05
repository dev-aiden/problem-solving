#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, m; cin >> n >> m;
    long long twoCount = 0, fiveCount = 0;
    for (long long i = 2; i <= n; i *= 2) {
        twoCount += n / i;
    }
    for (long long i = 5; i <= n; i *= 5) {
        fiveCount += n / i;
    }
    for (long long i = 2; i <= m; i *= 2) {
        twoCount -= m / i;
    }
    for (long long i = 5; i <= m; i *= 5) {
        fiveCount -= m / i;
    }
    for (long long i = 2; i <= n - m; i *= 2) {
        twoCount -= (n - m) / i;
    }
    for (long long i = 5; i <= n - m; i *= 5) {
        fiveCount -= (n - m) / i;
    }
    cout << min(twoCount, fiveCount) << "\n";
    return 0;
}
