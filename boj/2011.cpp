#include <iostream>

using namespace std;

string s;
int d[5003];

int solve(int n) {
    if (n == 0) return 1;
    if (d[n] > 0) return d[n];
    int num = s[n] - 48;
    if (num >= 1 && num <= 9) {
        d[n] = solve(n - 1);
        d[n] %= 1000000;
    }
    if (n != 1 && s[n - 1] - 48 != 0) {
        num = (s[n - 1] - 48) * 10 + (s[n] - 48);
        if (num >= 10 && num <= 26) {
            d[n] += solve(n - 2);
            d[n] %= 1000000;
        }
    }
    return d[n];
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin >> s;
    int len = s.length();
    s = " " + s;
    cout << solve(len) << "\n";
    return 0;
}
