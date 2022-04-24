#include <iostream>
#include <vector>
#include <queue>

using namespace std;

vector<int> arr[100003];
int check[100003];
int parent[100003];
queue<int> q;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for(int i = 0; i < n - 1; ++i) {
        int u, v; cin >> u >> v;
        arr[u].push_back(v);
        arr[v].push_back(u);
    }
    q.push(1);
    check[1] = 1;
    while(!q.empty()) {
        int p = q.front();
        q.pop();
        int len = arr[p].size();
        for(int i = 0; i < len; ++i) {
            int num = arr[p][i];
            if(!check[num]) {
                q.push(num);
                parent[num] = p;
                check[num] = 1;
            }
        }
    }
    for(int i = 2; i <= n; ++i) {
        cout << parent[i] << "\n";
    }
    return 0;
}