#include <iostream>
#include <vector>

using namespace std;

vector<int> prime;
int check[1000003];

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    check[1] = 1;
    for (int i = 2; i <= 1000000; ++i) {
        if (check[i] == 0) {
            prime.push_back(i);
            for (int j = i + i; j <= 1000000; j += i) {
                check[j] = 1;
            }
        }
    }
    int len = prime.size();
    while (1) {
        int num; cin >> num;
        if (num == 0) break;
        for (int i = 0; i < len; ++i) {
            if (check[num - prime[i]] == 0) {
                cout << num << " = " << prime[i] << " + " << num - prime[i] << "\n";
                break;
            }
        }
    }
    return 0;
}
