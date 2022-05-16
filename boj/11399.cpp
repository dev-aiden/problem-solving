#include <iostream>
#include <algorithm>

using namespace std;

int arr[1003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for(int i = 0; i < n; ++i) cin >> arr[i];
    sort(arr, arr + n);
    int ans = arr[0], temp = arr[0];
    for(int i = 1; i < n; ++i) {
        temp += arr[i];
        ans += temp;
    }
    cout << ans << "\n";
    return 0;
}