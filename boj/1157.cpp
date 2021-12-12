#include <iostream>
#include <string>

using namespace std;

int cnt[63];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    string s; cin >> s;
    int len = s.length();
    for (int i = 0; i < len; ++i) {
        if (s[i] >= 65 && s[i] <= 90) ++cnt[s[i] - 65];
        else ++cnt[s[i] - 97];
    }
    int maxCnt = 0;
    char ch;
    for (int i = 0; i < 26; ++i) {
        if (maxCnt < cnt[i]) {
            maxCnt = cnt[i];
            ch = i + 65;
        }
        else if (maxCnt == cnt[i]) {
            ch = '?';
        }
    }
    cout << ch << "\n";
    return 0;
}
