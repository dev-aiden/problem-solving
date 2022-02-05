#include <iostream>
#include <vector>

using namespace std;

vector<int> vec[20003];
int check[20003];
bool ans;

void dfs(int num, int val) {
    check[num] = val;
    int len = vec[num].size();
    for(int i = 0; i < len; ++i) {
        if(check[vec[num][i]] == 0) dfs(vec[num][i], 3 - val);
        else if(check[vec[num][i]] == val) ans = false;
    }
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int k; for(cin >> k; k--;) {
        int v, e; cin >> v >> e;
        for(int i = 1; i <= v; ++i) {
            vec[i].clear();
            check[i] = 0;
        }
        ans = true;
        for(int i = 0; i < e; ++i) {
            int a, b; cin >> a >> b;
            vec[a].push_back(b); vec[b].push_back(a);
        }
        for(int i = 1; i <= v; ++i) {
            if(check[i] == 0) dfs(i, 1);
        }
        cout << (ans ? "YES" : "NO") << "\n";
    }
    return 0;
}