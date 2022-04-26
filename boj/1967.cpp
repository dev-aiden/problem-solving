#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector<pair<int ,int>> arr[10003];
int dist[10003];
int check[10003];

void bfs(int start) {
    queue<int> q;
    q.push(start);
    check[start] = 1;
    while(!q.empty()) {
        int node = q.front();
        q.pop();
        int len = arr[node].size();
        for(int i = 0; i < len; ++i) {
            if(check[arr[node][i].first] == 0) {
                check[arr[node][i].first] = 1;
                q.push(arr[node][i].first);
                dist[arr[node][i].first] = dist[node] + arr[node][i].second;
            }
        }
    }
}
int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for(int i = 0; i < n - 1; ++i) {
        int u, v, w; cin >> u >> v >> w;
        arr[u].push_back(make_pair(v, w));
        arr[v].push_back(make_pair(u, w));
    }
    bfs(1);
    int maxNode = -1, maxDist = -1;
    for(int i = 1; i <=n; ++i) {
        if(dist[i] > maxDist) {
            maxDist = dist[i];
            maxNode = i;
        }
        dist[i] = 0;
        check[i] = 0;
    }
    bfs(maxNode);
    maxDist = -1;
    for(int i = 1; i <=n; ++i) {
        if(dist[i] > maxDist) {
            maxDist = dist[i];
        }
    }
    cout << maxDist << "\n";
    return 0;
}