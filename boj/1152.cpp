#include <iostream>
#include <string>

using namespace std;

int cnt[63];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    string s; getline(cin, s);
    int len = s.length();
    int ans = 0;
    if (len == 1 && s[0] == ' ') {
        cout << 0 << "\n";
        return 0;
    }
    for (int i = 0; i < len; ++i) {
        if ((i == 0 || i == len - 1) && s[i] == ' ') continue;
        if (s[i] == ' ') ++ans;
    }
    cout << ans + 1 << "\n";
    return 0;
}
