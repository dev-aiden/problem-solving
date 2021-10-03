#include <iostream>
#include <vector>

using namespace std;

vector<int> v(10003);

int main(void) {
    ios_base::sync_with_stdio(false);
    int begin = 0, end = 0;
    int n; for (cin >> n; n--;) {
        string cmd; cin >> cmd;
        if (cmd == "push") {
            int num; cin >> num;
            v[end++] = num;
        }
        else if (cmd == "pop") {
            if (begin == end) {
                cout << "-1" << "\n";
            }
            else {
                cout << v[begin] << "\n";
                v[begin++] = 0;
            }
        }
        else if (cmd == "size") {
            cout << end - begin << "\n";
        }
        else if (cmd == "empty") {
            cout << (begin == end ? 1 : 0) << "\n";
        }
        else if (cmd == "front") {
            cout << (begin == end ? -1 : v[begin]) << "\n";
        }
        else if (cmd == "back") {
            cout << (begin == end ? -1 : v[end - 1]) << "\n";
        }
    }
    return 0;
}
