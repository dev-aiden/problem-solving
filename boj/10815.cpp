#include <iostream>
#include <algorithm>

using namespace std;

int n, m;
int arr[500003], arr2[500003];

int bSearch(int num) {
    int start = 0, end = n - 1;
    while(start <= end) {
        int mid = (start + end) / 2;
        if(arr[mid] == num) {
            return 1;
        } else if(arr[mid] > num) {
            end = mid - 1;
        } else if(arr[mid] < num) {
            start = mid + 1;
        }
    }
    return 0;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> n;
    for(int i = 0; i < n; ++i) cin >> arr[i];
    sort(arr, arr + n);
    cin >> m;
    for(int i = 0; i < m; ++i) cin >> arr2[i];
    for(int i = 0; i < m; ++i) cout << bSearch(arr2[i]) << " ";
    cout << "\n";
    return 0;
}