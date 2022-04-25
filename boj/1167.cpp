#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector<pair<int ,int>> arr[100003];
int dist[100003];
int check[100003];

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
    for(int i = 0; i < n; ++i) {
        int u; cin >> u;
        while(1) {
            int v; cin >> v;
            if(v == -1) break;
            int d; cin >> d;
            arr[u].push_back(make_pair(v, d));
        }
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