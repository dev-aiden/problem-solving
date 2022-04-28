#include <iostream>
#include <algorithm>

using namespace std;

struct Meeting {
    int begin;
    int end;
};

Meeting arr[100003];

bool cmp(const Meeting &u, const Meeting &v) {
    if(u.end == v.end) {
        return u.begin < v.begin;
    }
    return u.end < v.end;
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; cin >> n;
    for(int i = 0; i < n; ++i) cin >> arr[i].begin >> arr[i].end;
    sort(arr, arr + n, cmp);
    int ans = 0;
    int temp = 0;
    for(int i = 0; i < n; ++i) {
        if(temp <= arr[i].begin) {
            temp = arr[i].end;
            ++ans;
        }
    }
    cout << ans << "\n";
    return 0;
}