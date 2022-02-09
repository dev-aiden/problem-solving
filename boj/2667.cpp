#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int arr[33][33];
int check[33][33];
vector<int> v;
int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, -1, 0, 1};
int n;

int dfs(int x, int y, int cnt) {
    int ret = 1;
    check[x][y] = cnt;
    for(int i = 0; i < 4; ++i) {
        int nx = x + dx[i], ny = y + dy[i];
        if(nx >= 1 && nx <= n && ny >= 1 && ny <= n && arr[nx][ny] && !check[nx][ny]) {
            ret += dfs(nx, ny, cnt);
        }
    }
    return ret;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> n;
    for(int i = 1; i <= n; ++i) {
        string temp; cin >> temp;
        for(int j = 1; j <= n; ++j) arr[i][j] = temp.at(j - 1) - 48;
    }
    int cnt = 0;
    for(int i = 1; i <= n; ++i) {
        for(int j = 1; j <= n; ++j) {
            if(arr[i][j] && !check[i][j]) v.push_back(dfs(i, j, ++cnt));
        }
    }
    sort(v.begin(), v.end());
    cout << cnt << "\n";
    int len = v.size();
    for(int i = 0; i < len; ++i) cout << v[i] << "\n";
    return 0;
}