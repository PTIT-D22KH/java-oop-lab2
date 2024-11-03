#include <bits/stdc++.h>
using namespace std;
int main() {
  int n;
  cin >> n;
  int a = 10000000, b = 10000000;
  int c[4];
  int d[4][4];
  for (int i = 0; i < n; i++) {
        int x, y;
        cin >> x >> y;
        a = min(a, x);
        b = min(b, y);
  }
  cout << a * b << endl;
  return 0;
}