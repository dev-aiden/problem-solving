#include <iostream>
#include <vector>

using namespace std;

vector<int> v;

int main(void) {
    ios_base::sync_with_stdio(false);
    int n; for (cin >> n; n--;) {
        string cmd; cin >> cmd;
        if (cmd == "push") {
            int num; cin >> num;
            v.push_back(num);
        } else if (cmd == "pop") {
            if (v.size() != 0) {
                cout << v.back() << "\n";
                v.pop_back();
            } else {
                cout << "-1" << "\n";
            }
        } else if (cmd == "size") {
            cout << v.size() << "\n";
        } else if (cmd == "empty") {
            cout << (v.size() ? 0 : 1) << "\n";
        } else if (cmd == "top") {
            cout << (v.size() ? v.back() : -1) << "\n";
        }
    }
    return 0;
}
