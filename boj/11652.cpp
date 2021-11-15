#include <iostream>
#include <algorithm>

using namespace std;

long long arr[100003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    long long n; cin >> n;
    for (int i = 0; i < n; ++i) cin >> arr[i];
    sort(arr, arr + n);
    long long ans = arr[0], maxCount = 1, temp = 1;
    for (int i = 1; i < n; ++i) {
        if (arr[i] == arr[i - 1]) ++temp;
        else temp = 1;
        if (maxCount < temp) {
            maxCount = temp;
            ans = arr[i];
        }
    }
    cout << ans << "\n";
    return 0;
}
