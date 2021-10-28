#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; cin >> n;
    string ans;
    if (n == 0) {
        cout << 0 << "\n";
        return 0;
    }
    while (n != 0) {
        int a = n / (-2), b = n % 2;
        if (b < 0) {
            ++a;
            b = 1;
        }
        n = a;
        ans += (char)b + 48;
    }
    reverse(ans.begin(), ans.end());
    cout << ans << "\n";
    return 0;
}
