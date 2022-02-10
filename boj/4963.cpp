#include <iostream>

using namespace std;

int w, h;
int arr[53][53];
int check[53][53];
int dx[8] = {-1, -1, 0, 1, 1, 1, 0, -1};
int dy[8] = {0, 1, 1, 1, 0, -1, -1, -1};

void dfs(int y, int x) {
    check[y][x] = 1;
    for(int i = 0; i < 8; ++i) {
        int nx = x + dx[i], ny = y + dy[i];
        if(nx >= 1 && nx <= w && ny >= 1 && ny <= h && arr[ny][nx] && !check[ny][nx]) dfs(ny, nx);
    }
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    while(1) {
        cin >> w >> h;
        if(!w && !h) break;
        for(int i = 1; i <= h; ++i) {
            for(int j = 1; j <= w; ++j) {
                cin >> arr[i][j];
                check[i][j] = 0;
            }
        }
        int ans = 0;
        for(int i = 1; i <= h; ++i) {
            for(int j = 1; j <= w; ++j) {
                if(arr[i][j] && !check[i][j]) {
                    ++ans;
                    dfs(i, j);
                }
            }
        }
        cout << ans << "\n";
    }
    return 0;
}