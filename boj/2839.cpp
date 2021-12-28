#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    int ans = -1;
    for (int i = 0; i <= n / 3; ++i) {
        int temp = n - (3 * i);
        if (temp % 5 == 0 && (ans == -1 || ans > i + (temp / 5)))
            ans = i + (temp / 5);
    }
    cout << ans << "\n";
    return 0;
}
