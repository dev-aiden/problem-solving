#include <iostream>

using namespace std;

int arr[1003];
int check[1003];

void dfs(int num) {
    if(check[num]) return;
    check[num] = 1;
    dfs(arr[num]);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t; for(cin >> t; t--;) {
        int n; cin >> n;
        for(int i = 1; i <= n; ++i) {
            check[i] = 0;
            int num; cin >> num;
            arr[i] = num;
        }
        int ans = 0;
        for(int i = 1; i <= n; ++i) {
            if(!check[i]) {
                ++ans;
                dfs(i);
            }
        }
        cout << ans << "\n";
    }
    return 0;
}