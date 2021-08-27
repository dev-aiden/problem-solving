#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    int len = s.length();
    int i = 0;
    while (i < len) {
        cout << s[i];
        if (i % 10 == 9) cout << '\n';
        ++i;
    }
    return 0;
}
