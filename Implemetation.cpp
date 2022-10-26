#include <iostream>
using namespace std;
int prefix_sum(int pre[], int i)
{
  i = i + 1;
  int sum = 0;
  while (i > 0)
  {
    sum += pre[i];
    i = i - (i & -i);
  }
  return sum;
}

void update(int a[], int i, int x, int pre[], int n)
{
  int diff = a[i] - x;
  a[i] = x;
  i = i + 1;
  while (i <= n)
  {
    pre[i] += diff;
    i = i + (i & (-i));
  }
}
void build(int a[], int pre[], int n)
{
  for (int i = 0; i < n; i++)
  {
    update(a, i, 0, pre, n);
  }
}
int main()
{
  int n = 10;
  int a[n] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
  int pre[n + 1];
  for (int i = 0; i <= n; i++)
    pre[i] = 0;
  build(a, pre, n);
  for (int i = 0; i <= n; i++)
    cout << pre[i] << endl;
  cout << (prefix_sum(pre, 5) - prefix_sum(pre, 1));
  return 0;
}