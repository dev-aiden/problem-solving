#include <iostream>

using namespace std;

string str;

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    cin >> str;
    int len = str.length();
    int ans = 0, num = 0, flag = 0;
    for(int i = 0; i < len; ++i) {
        if(str[i] >= '0' && str[i] <= '9') {
            num *= 10;
            num += (str[i] - '0');
        } else {
            if(flag) num *= (-1);
            ans += num;
            num = 0;
            if(str[i] == '-') {
                flag = 1;
            }
        }
    }
    if(flag) num *= (-1);
    ans += num;
    cout << ans << "\n";
    return 0;
}