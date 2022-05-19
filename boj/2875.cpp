#include <iostream>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, m, k; cin >> n >> m >> k;
    int ans, temp = m * 2;
    if(n % 2 == 1) {
        --n;
        --k;
    }
    if(n > temp) {
        k -= (n - temp);
        ans = m;
    } else {
        k -= ((temp - n) / 2);
        ans = n / 2;
    }
    while(k > 0) {
        k -= 3;
        --ans;
    }
    cout << ans << "\n";
    return 0;
}