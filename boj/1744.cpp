#include <iostream>
#include <algorithm>

using namespace std;

int arr[53], visit[53];

int main(void) {
    int n; cin >> n;
    for(int i= 0 ;i < n; ++i) cin >> arr[i];
    sort(arr, arr + n);
    int ans = 0;
    for(int i = n - 1; i >= 0; i -= 2) {
        if(i - 1 < 0) break;
        if(arr[i] > 1 && arr[i - 1] > 1) {
            visit[i] = visit[i - 1] = 1;
            ans += (arr[i] * arr[i - 1]);
        }
    }
    for(int i = 0; i < n; i += 2) {
        if(i + 1 >= n) break;
        if(!visit[i] && !visit[i + 1] && arr[i] <= 0 && arr[i + 1] <= 0) {
            visit[i] = visit[i + 1] = 1;
            ans += (arr[i] * arr[i + 1]);
        }
    }
    for(int i = 0; i < n; ++i) {
        if(!visit[i]) ans += arr[i];
    }
    cout << ans << "\n";
    return 0;   
}