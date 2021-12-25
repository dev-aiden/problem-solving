#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    while (1) {
        int a, b, c; cin >> a >> b >> c;
        if (!a && !b && !c) break;
        int maxVal = max(max(a, b), c);
        if (maxVal == a && ((a * a) == (b * b + c * c))) {
            cout << "right" << "\n";
            continue;
        } else if (maxVal == b && ((b * b) == (a * a + c * c))) {
            cout << "right" << "\n";
            continue;
        } else if (maxVal == c && ((c * c) == (a * a + b * b))) {
            cout << "right" << "\n";
            continue;
        }
        cout << "wrong" << "\n";
    }
    return 0;
}
