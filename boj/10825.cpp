#include <iostream>
#include <algorithm>

using namespace std;

struct Score {
    string name;
    int kor;
    int eng;
    int math;
};

Score arr[100003];

bool cmp(const Score& u, const Score& v) {
    if (u.kor == v.kor) {
        if (u.eng == v.eng) {
            if (u.math == v.math) {
                return u.name < v.name;
            }
            return u.math > v.math;
        }
        return u.eng < v.eng;
    }
    return u.kor > v.kor;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for (int i = 0; i < n; ++i) cin >> arr[i].name >> arr[i].kor >> arr[i].eng >> arr[i].math;
    sort(arr, arr + n, cmp);
    for (int i = 0; i < n; ++i) cout << arr[i].name << "\n";
    return 0;
}
