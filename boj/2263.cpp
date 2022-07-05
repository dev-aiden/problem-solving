#include <iostream>

using namespace std;

int inorder[100003], postorder[100003];

void solve(int inStart, int inEnd, int postStart, int postEnd) {
    if (inStart > inEnd || postStart > postEnd) return;
    int rootIndex;
    for(int i = inStart; i <= inEnd; ++i) {
        if(inorder[i] == postorder[postEnd]) {
            rootIndex = i;
            break;
        }
    }
    cout << postorder[postEnd] <<  " ";
    solve(inStart, rootIndex - 1, postStart, postStart + rootIndex - inStart - 1);
    solve(rootIndex + 1, inEnd, postStart + rootIndex - inStart, postEnd - 1);
}

int main(void) {
    int n; cin >> n;
    for(int i = 0; i < n; ++i) cin >> inorder[i];
    for(int i = 0; i < n; ++i) cin >> postorder[i];
    solve(0, n - 1, 0, n - 1);
    cout << "\n";
    return 0;
}