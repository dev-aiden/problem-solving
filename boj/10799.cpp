#include <iostream>
#include <stack>

using namespace std;

stack<int> s;

int main(void) {
    ios_base::sync_with_stdio(false);
    string str; cin >> str;
    int len = str.length();
    int ans = 0;
    for (int i = 0; i < len; ++i) {
        if (str[i] == '(') {
            s.push(i);
        } else {
            if (s.top() == (i - 1)) {
                s.pop();
                ans += s.size();
            } else {
                s.pop();
                ++ans;
            }
        }
    }
    cout << ans << "\n";
    return 0;
}
