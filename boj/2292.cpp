#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int now = 1, next = 6, ans = 1;
    int n; cin >> n;
    while (now < n) {
        now += next;
        next += 6;
        ++ans;
    }
    cout << ans << "\n";
    return 0;
}
