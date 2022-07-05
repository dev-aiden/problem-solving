#include <iostream>

using namespace std;

int arr[66][66];

void solve(int r, int c, int size) {
    int val = arr[r][c], flag = 1;
    for(int i = r; i < r + size; ++i) {
        for(int j = c; j < c + size; ++j) {
            if(arr[r][c] != arr[i][j]) {
                flag = 0;
                break;
            }
        }
        if(!flag) break;
    }
    if(flag) {
        cout << arr[r][c];
    } else {
        cout << "(";
        solve(r, c, size / 2);
        solve(r, c + size / 2, size / 2);
        solve(r + size / 2, c, size / 2);
        solve(r + size / 2, c + size / 2, size / 2);
        cout << ")";
    }
}

int main(void) {
    int n; cin >> n;
    for(int i = 0; i < n; ++i) {
        string s; cin >> s;
        for(int j = 0; j < n; ++j) {
            arr[i][j] = s[j] - '0';
        }
    }
    solve(0, 0, n);
    cout << "\n";
    return 0;
}