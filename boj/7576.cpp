#include <iostream>
#include <queue>
#include <algorithm>

using namespace std;

int m, n;
int arr[1003][1003];
int dist[1003][1003];
int dx[4] = {-1, 0, 1, 0};
int dy[4] = {0, -1, 0, 1};
queue<pair<int, int>> q;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> m >> n;
    for(int i = 1; i <= n; ++i) {
        for(int j = 1; j <= m; ++j) {
            cin >> arr[i][j];
            dist[i][j] = -1;
            if(arr[i][j] == 1) {
                q.push(make_pair(i, j));
                dist[i][j] = 0;
            }
        }
    }
    while(!q.empty()) {
        int y = q.front().first;
        int x = q.front().second;
        q.pop();
        for(int i = 0; i < 4; ++i) {
            int ny = y + dy[i];
            int nx = x + dx[i];
            if(1 <= ny && ny <= n && 1 <= nx && nx <= m) {
                if(arr[ny][nx] == 0 && dist[ny][nx] == -1) {
                    q.push(make_pair(ny, nx));
                    dist[ny][nx] = dist[y][x] + 1;
                }
            }
        }
    }
    int ans = 0, flag = 1;
    for(int i = 1; i <= n; ++i) {
        for(int j = 1; j <= m; ++j) {
            if(ans < dist[i][j]) ans = dist[i][j];
            if(arr[i][j] == 0 && dist[i][j] == -1) flag = 0;
        }
    }
    cout << (flag ? ans : -1) << "\n";
    return 0;
}