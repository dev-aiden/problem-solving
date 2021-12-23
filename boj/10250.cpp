#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t; for (cin >> t; t--;) {
        int h, w, n; cin >> h >> w >> n;
        cout << (n - 1) % h + 1;
        if ((n - 1) / h + 1 < 10) cout << 0;
        cout << (n - 1) / h + 1 << "\n";
    }
    return 0;
}
