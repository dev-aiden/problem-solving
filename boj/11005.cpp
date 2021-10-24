#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int n, b; cin >> n >> b;
    string ans;
    while (n != 0) {
        int temp = n % b;
        if (temp < 10) ans += (temp + 48);
        else ans += (temp + 55);
        n /= b;
    }
    reverse(ans.begin(), ans.end());
    cout << ans << "\n";
    return 0;
}
