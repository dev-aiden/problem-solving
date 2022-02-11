#include <iostream>
#include <queue>
#include <algorithm>

using namespace std;

int n, m;
int arr[103][103];
int check[103][103];
queue<pair<int, int>> q;
int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, -1, 0, 1};

void bfs(int a, int b) {
    check[a][b] = 1;
    q.push(make_pair(a, b));
    while(!q.empty()) {
        pair<int, int> temp = q.front();
        q.pop();
        for(int i = 0; i < 4; ++i) {
            int ny = temp.first + dy[i], nx = temp.second + dx[i];
            if(ny >= 1 && ny <= n && nx >= 1 && nx <= m && arr[ny][nx] && !check[ny][nx]) {
                check[ny][nx] = check[temp.first][temp.second] + 1;
                q.push(make_pair(ny, nx));
            }
        }
    }
}

int main(void) {
    cin >> n >> m;
    for(int i = 1; i <= n; ++i) {
        string s; cin >> s;
        for(int j = 1; j <= m; ++j) arr[i][j] = s[j - 1] - 48;
    }
    bfs(1, 1);
    cout << check[n][m] << "\n";
    return 0;
}