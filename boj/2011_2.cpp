#include <iostream>

using namespace std;

int d[5003];

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    int len = s.length();
    s = " " + s;
    d[0] = 1;
    for (int i = 1; i <= len; ++i) {
        int num = s[i] - 48;
        if (num >= 1 && num <= 9) {
            d[i] = d[i - 1];
            d[i] %= 1000000;
        }
        if (i == 1 || s[i - 1] - 48 == 0) continue;
        num = (s[i - 1] - 48) * 10 + (s[i] - 48);
        if (num >= 10 && num <= 26) {
            d[i] += d[i - 2];
            d[i] %= 1000000;
        }
    }
    cout << d[len] << "\n";
    return 0;
}
