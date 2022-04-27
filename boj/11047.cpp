#include <iostream>

using namespace std;

int arr[13];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, k; cin >> n >> k;
    for(int i = 0; i < n; ++i) cin >> arr[i];
    int ans = 0;
    for(int i = n - 1; i >= 0; --i) {
        ans += (k / arr[i]);
        k %= arr[i];
    }
    cout << ans << "\n";
    return 0;
}