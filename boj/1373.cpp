#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    int len = s.length();
    string ans;
    for (int i = len - 1; i >= 0; i -= 3) {
        int temp = 0, num = 1;
        for (int j = 0; j < 3; ++j) {
            if (i - j >= 0) {
                temp += (s[i - j] - 48) * num;
                num *= 2;
            }
        }
        ans += (char)temp + 48;
    }
    reverse(ans.begin(), ans.end());
    cout << ans << "\n";
    return 0;
}
