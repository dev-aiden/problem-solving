#include <iostream>
#include <string>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; getline(cin, s);
    int len = s.length();
    for (int i = 0; i < len; ++i) {
        if (s[i] >= 65 && s[i] <= 90) {
            if(s[i] + 13 <= 90) s[i] += 13;
            else s[i] -= 13;
        } else if (s[i] >= 97 && s[i] <= 122) {
            if(s[i] + 13 <= 122) s[i] += 13;
            else s[i] -= 13;
        }
    }
    cout << s << "\n";
    return 0;
}
