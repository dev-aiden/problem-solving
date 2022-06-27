#include <iostream>

using namespace std;

int arr[2222][2222];
int ans[3]; // [0] : -1, [1] : 0, [2] : 1

void solve(int startRow, int startCol, int size) {
    int num = arr[startRow][startCol];
    int flag = 1;
    for (int i = startRow; i < startRow + size; ++i) {
        for (int j = startCol; j < startCol + size; ++j) {
            if (num != arr[i][j]) {
                flag = 0;
                break;
            }
        }
        if (!flag) break;
    }
    if (!flag) {
        solve(startRow, startCol, size / 3);
        solve(startRow, startCol + size / 3, size / 3);
        solve(startRow, startCol + (2 * (size / 3)), size / 3);
        solve(startRow + size / 3, startCol, size / 3);
        solve(startRow + size / 3, startCol + size / 3, size / 3);
        solve(startRow + size / 3, startCol + (2 * (size / 3)), size / 3);
        solve(startRow + (2 * (size / 3)), startCol, size / 3);
        solve(startRow + (2 * (size / 3)), startCol + size / 3, size / 3);
        solve(startRow + (2 * (size / 3)), startCol + (2 * (size / 3)), size / 3);
    }
    else {
        ++ans[num + 1];
    }
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for (int i = 0; i < n; ++i) {
        for (int j = 0; j < n; ++j) cin >> arr[i][j];
    }
    solve(0, 0, n);
    cout << ans[0] << "\n";
    cout << ans[1] << "\n";
    cout << ans[2] << "\n";
    return 0;
}
