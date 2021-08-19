#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        int a, b; cin >> a >> b;
        cout << a + b << '\n';
    }
    return 0;
}
