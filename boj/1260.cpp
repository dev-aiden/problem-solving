#include <iostream>
#include <vector>
#include <queue>
#include <algorithm>

using namespace std;

vector<int> arr[1003];
int check[1003];
queue<int> q;

void dfs(int num) {
    check[num] = 1;
    cout << num << " ";
    int len = arr[num].size();
    for(int i = 0; i < len; ++i) {
        if(!check[arr[num][i]]) dfs(arr[num][i]);
    }
}

void bfs(int num) {
    q.push(num);
    check[num] = 1;
    while(!q.empty()) {
        int temp = q.front();
        cout << temp << " ";
        q.pop();
        int len = arr[temp].size();
        for(int i = 0; i < len; ++i) {
            if(!check[arr[temp][i]]) {
                q.push(arr[temp][i]);
                check[arr[temp][i]] = 1;
            }
        }
    }
    cout << "\n";
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n, m, v; cin >> n >> m >> v;
    for(int i = 0; i < m; ++i) {
        int a, b; cin >> a >> b;
        arr[a].push_back(b); arr[b].push_back(a);
    }
    for(int i = 1; i <= n; ++i) sort(arr[i].begin(), arr[i].end());
    dfs(v);
    cout << "\n";
    for(int i = 0; i <= n; ++i) check[i] = 0;
    bfs(v);
    return 0;
}