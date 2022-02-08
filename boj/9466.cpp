#include <iostream>

using namespace std;

int arr[100003];
int check[100003];
int start[100003];

int dfs(int num, int s, int cnt) {
    if(check[num]) {
        if(start[num] == s) return cnt - check[num];
        return 0;
    }
    check[num] = cnt;
    start[num] = s;
    return dfs(arr[num], s, cnt + 1);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int t; for(cin >> t; t--;) {
        int n; cin >> n;
        for(int i = 1; i <= n; ++i) {
            cin >> arr[i];
            start[i] = check[i] = 0;
        }
        int ans = 0;
        for(int i = 1; i <= n; ++i) {
            if(!check[i]) ans += dfs(i, i, 1);
        }
        cout << n - ans << "\n";
    }
    return 0;
}