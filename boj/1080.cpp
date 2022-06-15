#include <iostream>

using namespace std;

int arr[53][53], arr2[53][53];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, m; cin >> n >> m;
    for(int i = 0; i < n; ++i) {
        string s; cin >> s;
        for(int j = 0; j < m; ++j) arr[i][j] = s[j] - '0';
    }
    for(int i = 0; i < n; ++i) {
        string s; cin >> s;
        for(int j = 0; j < m; ++j) arr2[i][j] = s[j] - '0';
    }
    int ans = 0;
    for(int i = 0; i < n - 2; ++i) {
        for(int j = 0; j < m - 2; ++j) {
            if(arr[i][j] != arr2[i][j]) {
                ++ans;
                for(int k = 0; k < 3; ++k) {
                    for(int l = 0; l < 3; ++l) {
                        arr[i + k][j + l] = !arr[i + k][j + l];
                    }
                }
            }
        }
    }
    int flag = 1;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < m; ++j) {
            if(arr[i][j] != arr2[i][j]) flag = 0;
        }
    }
    if(!flag) cout << -1 << "\n";
    else cout << ans << "\n";
    return 0;
}