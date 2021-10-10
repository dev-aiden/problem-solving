#include <iostream>
#include <vector>

using namespace std;

vector<int> v(20003);

int main(void) {
    ios_base::sync_with_stdio(false);
    int begin = 10000, end = 10001;
    int n; for (cin >> n; n--;) {
        string cmd; cin >> cmd;
        if (cmd == "push_front") {
            int num; cin >> num;
            v[begin--] = num;
        } else if (cmd == "push_back") {
            int num; cin >> num;
            v[end++] = num;
        } else if (cmd == "pop_front") {
            if (begin == end - 1) {
                cout << "-1" << "\n";
            } else {
                cout << v[++begin] << "\n";
                v[begin] = 0;
            }
        } else if (cmd == "pop_back") {
            if (begin == end - 1) {
                cout << "-1" << "\n";
            }
            else {
                cout << v[--end] << "\n";
                v[end] = 0;
            }
        } else if (cmd == "size") {
            cout << end - begin - 1 << "\n";
        } else if (cmd == "empty") {
            cout << (begin == end - 1 ? 1 : 0) << "\n";
        } else if (cmd == "front") {
            cout << (begin == end - 1 ? -1 : v[begin + 1]) << "\n";
        } else if (cmd == "back") {
            cout << (begin == end - 1 ? -1 : v[end - 1]) << "\n";
        }
    }
    return 0;
}
