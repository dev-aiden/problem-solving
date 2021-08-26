#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int n, sum = 0; for (cin >> n; n--;) {
        char c; cin >> c;
        sum += c - 48;
    }
    cout << sum << '\n';
    return 0;
}
