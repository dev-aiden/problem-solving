#include <iostream>

using namespace std;

int arr[2000003], arr1[1000003], arr2[1000003];

int main(void) {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	int n, m; cin >> n >> m;
	for (int i = 0; i < n; ++i) cin >> arr1[i];
	for (int i = 0; i < m; ++i) cin >> arr2[i];
	int i = 0, j = 0, k = 0;
	while (i < n && j < m) {
		if (arr1[i] < arr2[j]) arr[k++] = arr1[i++];
		else arr[k++] = arr2[j++];
	}
	while (i < n) arr[k++] = arr1[i++];
	while (j < m) arr[k++] = arr2[j++];
	for (int i = 0; i < n + m; ++i) cout << arr[i] << " ";
	cout << "\n";
	return 0;
}