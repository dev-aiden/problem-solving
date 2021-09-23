#include <iostream>
#include <vector>

using namespace std;

vector<int> v(26, -1);

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    for (int i = 0; s[i]; ++i) {
        if (v[s[i] - 97] == -1) v[s[i] - 97] = i;
    }
    for (int i = 0; i < 26; ++i) cout << v[i] << " ";
    cout << "\n";
    return 0;
}
