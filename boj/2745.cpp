#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    string n; int b; cin >> n >> b;
    int len = n.length();
    int ans = 0;
    for (int i = 0; i < len; ++i) {
        int num = n[i] >= 65 ? n[i] - 55 : n[i] - 48;
        ans *= b;
        ans += num;
    }
    cout << ans << "\n";
    return 0;
}
