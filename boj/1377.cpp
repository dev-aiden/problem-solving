#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

vector<pair<int, int>> v(500003);

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for (int i = 0; i < n; ++i) {
        cin >> v[i].first;
        v[i].second = i;
    }
    sort(v.begin(), v.begin() + n);
    int ans = 0;
    for (int i = 0; i < n; ++i) {
        if (v[i].second - i > ans) {
            ans = v[i].second - i;
        }
    }
    cout << ans + 1 << "\n";
    return 0;
}
