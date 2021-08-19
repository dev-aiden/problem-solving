#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int a, b;
    while (cin >> a >> b) {
        cout << a + b << '\n';
    }
    return 0;
}
