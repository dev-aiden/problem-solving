#include <iostream>
#include <algorithm>

using namespace std;

int n, m, idx;
int arr[500003], arr2[500003];
int cnt[20000003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> n;
    for(int i = 0; i < n; ++i) {
        int num; cin >> num;
        ++cnt[num + 10000000];
    }
    cin >> m;
    for(int i = 0; i < m; ++i) cin >> arr2[i];
    for(int i = 0; i < m; ++i) cout << cnt[arr2[i] + 10000000] << " ";
    cout << "\n";
    return 0;
}