#include <iostream>
#include <string>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    string a, b, c, d; cin >> a >> b >> c >> d;
    long long s1 = stoll(a + b), s2 = stoll(c + d);
    cout << s1 + s2 << "\n";
    return 0;
}
