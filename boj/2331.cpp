#include <iostream>

using namespace std;

int check[1000003];

int next(int num, int p) {
    int ret = 0;
    while(num != 0) {
        int temp = 1;
        for(int i = 0; i < p; ++i) temp *= (num % 10);
        ret += temp;
        num /= 10;
    }
    return ret;
}

int solve(int num, int p, int cnt) {
    if(check[num]) return check[num] - 1;
    check[num] = cnt;
    int temp = next(num, p);
    return solve(temp, p, cnt + 1);
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int a, p; cin >> a >> p;
    cout << solve(a, p, 1) << "\n";
    return 0;
}