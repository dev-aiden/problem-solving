#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int a, b; cin >> a >> b;
    int ans = 0, temp = 1;
    while (b != 0) {
        int num = a * (b % 10);
        cout << num << "\n";
        b /= 10;
        ans += (num * temp);
        temp *= 10;
    }
    cout << ans << "\n";
    return 0;
}
