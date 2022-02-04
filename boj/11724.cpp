#include <iostream>
#include <vector>

using namespace std;

vector<int> vec[1003];
int check[1003];

void dfs(int num) {
    check[num] = 1;
    int len = vec[num].size();
    for(int i = 0; i < len; ++i) {
        if(!check[vec[num][i]]) dfs(vec[num][i]);
    }
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cout.tie(NULL); cin.tie(NULL);
    int n, m; cin >> n >> m;
    for(int i = 0; i < m; ++i) {
        int u, v; cin >> u >> v;
        vec[u].push_back(v); vec[v].push_back(u);
    }
    int ans = 0;
    for(int i = 1; i <= n; ++i) {
        if(!check[i]) {
            ++ans;
            dfs(i);
        }
    }
    cout << ans << "\n";
    return 0;
}