#include <iostream>
#include <algorithm>

using namespace std;

int arr[5000003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, k; cin >> n >> k;
    for (int i = 0; i < n; ++i) {
        int num; cin >> num;
        arr[i] = num;
    }
    sort(arr, arr + n);
    cout << arr[k - 1] << "\n";
    return 0;
}
