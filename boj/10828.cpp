#include <iostream>
#include <stack>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    stack<int> s;
    int n; for (cin >> n; n--;) {
        string cmd; cin >> cmd;
        if (cmd == "push") {
            int num; cin >> num;
            s.push(num);
        }
        else if (cmd == "pop") {
            if (s.size() != 0) {
                cout << s.top() << "\n";
                s.pop();
            }
            else {
                cout << "-1" << "\n";
            }
        }
        else if (cmd == "size") {
            cout << s.size() << "\n";
        }
        else if (cmd == "empty") {
            cout << s.empty() << "\n";
        }
        else if (cmd == "top") {
            cout << (s.size() ? s.top() : -1) << "\n";
        }
    }
    return 0;
}
