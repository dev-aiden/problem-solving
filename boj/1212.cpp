#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    int len = s.length();
    string ans;
    for (int i = 0; i < len; ++i) {
        int num = s[i] - 48;
        string temp;
        for (int j = 0; j < 3; ++j) {
            temp += (char)(num % 2) + 48;
            num /= 2;
            if (i == 0 && num == 0) break;
        }
        reverse(temp.begin(), temp.end());
        ans += temp;
    }
    cout << ans << "\n";
    return 0;
}
