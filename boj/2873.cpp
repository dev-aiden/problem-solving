#include <iostream>

using namespace std;

int arr[1003][1003];

int main(void) {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	int r, c; cin >> r >> c;
	int min_val = 9999, min_r, min_c;
	for (int i = 0; i < r; ++i) {
		for (int j = 0; j < c; ++j) {
			cin >> arr[i][j];
			if ((i + j) % 2 == 1 && min_val > arr[i][j]) {
				min_val = arr[i][j];
				min_r = i;
				min_c = j;
			}
		}
	}
	if (r % 2 != 0) {
		for (int i = 0; i < r; ++i) {
			for (int j = 0; j < c - 1; ++j) {
				if (i % 2 == 0) cout << "R";
				else cout << "L";
			}
			if(i != r - 1) cout << "D";
		}
	} else if (c % 2 != 0) {
		for (int i = 0; i < c; ++i) {
			for(int j = 0; j < r - 1; ++j) {
				if (i % 2 == 0) cout << "D";
				else cout << "U";
			}
			if (i != c - 1) cout << "R";
		}
	} else {
		int row = min_r % 2 ? min_r - 1 : min_r;
		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < c - 1; ++j) {
				if (i % 2 == 0) cout << "R";
				else cout << "L";
			}
			if (i != r - 1) cout << "D";
		}
		bool flag = true;
		for (int i = 0; i < c; ++i) {
			for (int j = row; j < row + 1; ++j) {
				if (i == min_c) {
					continue;
				} else {
					if (flag) cout << "D";
					else cout << "U";
					flag = !flag;
				}
				
			}
			if (i != c - 1) cout << "R";
		}
		row += 2;
		if(row < r) cout << "D";
		for (int i = row; i < r; ++i) {
			for (int j = 0; j < c - 1; ++j) {
				if (i % 2 == 0) cout << "L";
				else cout << "R";
			}
			if (i != r - 1) cout << "D";
		}
	}
	return 0;
}