#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<int> v(4);

int main(void) {
    ios_base::sync_with_stdio(false);
    string s;
    while (getline(cin, s)) {
        for (int i = 0; s[i]; ++i) {
            if (s[i] >= 97 && s[i] <= 122) ++v[0];
            else if (s[i] >= 65 && s[i] <= 90) ++v[1];
            else if (s[i] >= 48 && s[i] <= 57) ++v[2];
            else if (s[i] == ' ') ++v[3];
        }
        for (int i = 0; i < 4; ++i) {
            cout << v[i] << " ";
            v[i] = 0;
        }
        cout << "\n";
    }
    return 0;
}
