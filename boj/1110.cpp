#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    int origin = n, ans = 0;
    while (1) {
        ++ans;
        n = (n % 10) * 10 + ((n / 10) + (n % 10)) % 10;
        if (n == origin) break;
    }
    cout << ans << "\n";
    return 0;
}
