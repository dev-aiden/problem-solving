#include <iostream>

using namespace std;

int arr[33][2];

void preOrder(int start) {
    if(start == -1) return;
    cout << (char)(start + 'A');
    preOrder(arr[start][0]);
    preOrder(arr[start][1]);
}

void inOrder(int start) {
    if(start == -1) return;
    inOrder(arr[start][0]);
    cout << (char)(start + 'A');
    inOrder(arr[start][1]);
}

void postOrder(int start) {
    if(start == -1) return;
    postOrder(arr[start][0]);
    postOrder(arr[start][1]);
    cout << (char)(start + 'A');
}

int main(void) {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL); cout.tie(NULL);
    int n; for(cin >> n; n--;) {
        char c1, c2, c3; cin >> c1 >> c2 >> c3;
        if(c2 == '.') arr[c1 - 'A'][0] = -1;
        else arr[c1 - 'A'][0] = c2 - 'A';
        if(c3 == '.') arr[c1 - 'A'][1] = -1;
        else arr[c1 - 'A'][1] = c3 - 'A';
    }
    preOrder(0);
    cout << "\n";
    inOrder(0);
    cout << "\n";
    postOrder(0);
    cout << "\n";
    return 0;
}