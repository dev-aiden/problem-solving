#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int t, tc = 1; for (cin >> t; t--;) {
        int a, b; cin >> a >> b;
        cout << "Case #" << tc++ << ": " << a << " + " << b << " = " << a + b << '\n';
    }
    return 0;
}
