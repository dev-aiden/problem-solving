#include <iostream>

using namespace std;

int gcd(int a, int b) {
    while (b != 0) {
        int r = a % b;
        a = b;
        b = r;
    }
    return a;
}

int lcm(int a, int b) {
    return a * b / gcd(a, b);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    int t; for (cin >> t; t--;) {
        int a, b; cin >> a >> b;
        cout << lcm(a, b) << "\n";
    }
    return 0;
}
