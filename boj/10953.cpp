#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        string str; cin >> str;
        cout << str[0] + str[2] - 96 << '\n';
    }
    return 0;
}
