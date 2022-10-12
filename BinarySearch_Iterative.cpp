#include <iostream>
#include <algorithm>
using namespace std;
// O(1) Auxillary Space;
// O(log n) Time;
int binarySearch(int *a, int n, int x)
{
  int low = 0;
  int high = n - 1;
  while (low <= high)
  {
    int mid = low + (high - low) / 2;
    if (a[mid] == x)
      return mid;
    else if (x > a[mid])
      low = mid + 1;
    else
      high = mid - 1;
  }
  return -1;
}
int main()
{
  int a[7] = {10, 20, 30, 40, 50, 60, 70};
  int x = 60;
  cout << binarySearch(a, 7, x) << endl;

  //Using Builtin binary_search() stl algorithm
  cout << binary_search(a, a + 7, x);
  return 0;
}