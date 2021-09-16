#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        string s; cin >> s;
        int len = s.length();
        int sum = 0, flag = 1;
        for (int i = 0; i < len; ++i) {
            if (s[i] == '(') {
                ++sum;
            }
            else {
                --sum;
                if (sum < 0) {
                    flag = 0;
                    break;
                }
            }
        }
        if (sum > 0) flag = 0;
        cout << (flag ? "YES\n" : "NO\n");
    }
    return 0;
}
