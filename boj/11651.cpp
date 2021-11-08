#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<pair<int, int>> v(100003);

bool cmp(const pair<int ,int>& u, const pair<int, int>& v) {
    if (u.second == v.second) return u.first < v.first;
    return u.second < v.second;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for (int i = 0; i < n; ++i) cin >> v[i].first >> v[i].second;
    sort(v.begin(), v.begin() + n, cmp);
    for (int i = 0; i < n; ++i) cout << v[i].first << " " << v[i].second << "\n";
    return 0;
}
