#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main(void) {
    ios_base::sync_with_stdio(false);
    int a, b; cin >> a >> b;
    int temp = 0;
    int m; for (cin >> m; m--;) {
        int num; cin >> num;
        temp *= a;
        temp += num;
    }
    vector<int> v;
    while (temp != 0) {
        v.push_back(temp % b);
        temp /= b;
    }
    reverse(v.begin(), v.end());
    int len = v.size();
    for (int i = 0; i < len; ++i) cout << v[i] << " ";
    cout << "\n";
    return 0;
}
