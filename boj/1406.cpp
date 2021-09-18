#include <iostream>
#include <stack>

using namespace std;

stack<char> s1, s2;

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    int len = s.length();
    for (int i = 0; i < len; ++i) s1.push(s[i]);
    int n; for (cin >> n; n--;) {
        char cmd; cin >> cmd;
        if (cmd == 'L') {
            if (!s1.empty()) {
                s2.push(s1.top());
                s1.pop();
            }
        } else if (cmd == 'D') {
            if (!s2.empty()) {
                s1.push(s2.top());
                s2.pop();
            }
        } else if (cmd == 'B') {
            if (!s1.empty()) {
                s1.pop();
            }
        } else if (cmd == 'P') {
            char ch; cin >> ch;
            s1.push(ch);
        }
    }
    while (!s1.empty()) {
        s2.push(s1.top());
        s1.pop();
    }
    while (!s2.empty()) {
        cout << s2.top();
        s2.pop();
    }
    cout << "\n";
    return 0;
}
