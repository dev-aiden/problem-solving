#include <iostream>
#include <queue>

using namespace std;

int arr[103][103];
int group[103][103];
int dist[103][103];
int dy[4] = {-1, 0, 1, 0};
int dx[4] = {0, -1, 0, 1};

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            cin >> arr[i][j];
        }
    }
    int number = 1;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            if(arr[i][j] == 1 && group[i][j] == 0) {
                queue<pair<int, int>> q;
                q.push(make_pair(i, j));
                group[i][j] = number;
                while(!q.empty()) {
                    int y = q.front().first;
                    int x = q.front().second;
                    q.pop();
                    for(int k = 0; k < 4; ++k) {
                        int ny = y + dy[k];
                        int nx = x + dx[k];
                        if(ny >= 0 && ny < n && nx >= 0 && nx < n) {
                            if(arr[ny][nx] == 1 && group[ny][nx] == 0) {
                                q.push(make_pair(ny, nx));
                                group[ny][nx] = number;
                            }
                        }
                    }
                }
                ++number;
            }
        }
    }
    queue<pair<int, int>> q;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
                dist[i][j] = -1;
                if(arr[i][j] == 1) {
                    dist[i][j] = 0;
                    q.push(make_pair(i, j));
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
            if(ny >= 0 && ny < n && nx >= 0 && nx < n) {
                if(dist[ny][nx] == -1) {
                    dist[ny][nx] = dist[y][x] + 1;
                    group[ny][nx] = group[y][x];
                    q.push(make_pair(ny, nx));
                }
            }
        }
    }
    int ans = -1;
    for(int i = 0; i < n; ++i) {
        for(int j = 0; j < n; ++j) {
            for(int k = 0; k < 4; ++k) {
                int ny = i + dy[k];
                int nx = j + dx[k];
                if(ny >= 0 && ny < n && nx >= 0 && nx < n) {
                    if(group[i][j] != group[ny][nx]) {
                        if(ans == -1 || ans > dist[i][j] + dist[ny][nx]) {
                            ans = dist[i][j] + dist[ny][nx];
                        }
                    }
                }
            }
        }
    }
    cout << ans << "\n";
    return 0;
}