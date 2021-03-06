#include <iostream>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, m; cin >> n >> m;
    if(n == 1) {
        cout << 1 << "\n";
    } else if(n == 2) {
        cout << min(4, (m + 1) / 2) << "\n";
    } else if(n >= 3) {
        if(m >= 7) cout << m - 2 << "\n";
        else cout << min(4, m) << "\n";
    }
    return 0;
}