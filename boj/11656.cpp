#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<string> v;

int main(void) {
    ios_base::sync_with_stdio(false);
    string s; cin >> s;
    int len = s.length();
    for (int i = 0; i < len; ++i) v.push_back(s.substr(i));
    sort(v.begin(), v.end());
    for (int i = 0; i < len; ++i) cout << v[i] << "\n";
    return 0;
}
