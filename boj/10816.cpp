#include <iostream>
#include <algorithm>

using namespace std;

int n, m, idx;
int arr[500003], arr2[500003];
int cnt[20000003];

int bSearch(int num) {
    int start = 0, end = idx - 1;
    while(start <= end) {
        int mid = (start + end) / 2;
        if(arr[mid] == num) {
            return cnt[num];
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
    for(int i = 0; i < n; ++i) {
        int num; cin >> num;
        num += 10000000;
        if(cnt[num] == 0) {
            arr[idx++] = num;
            ++cnt[num];
        } else {
            ++cnt[num];
        }
    }
    sort(arr, arr + idx);
    cin >> m;
    for(int i = 0; i < m; ++i) cin >> arr2[i];
    for(int i = 0; i < m; ++i) cout << bSearch(arr2[i] + 10000000) << " ";
    cout << "\n";
    return 0;
}