#include <iostream>
using namespace std;
class prog2
{
    private:
    int a;
    public:
    prog2(int);
    int operator >(prog2);
};
prog2::prog2(int p)
{
    a=p;
}
int prog2::operator >(prog2 pg1)
{
    if(a>pg1.a)
    return 1;
    else
    return 0;
}
int main()
{
    prog2 c(6);
    prog2 d(6);
    if(c>d)
    cout<<"Object c is greater.";
    else if(d>c)
    cout<<"Object d is greater.";
    else
    cout<<"Both are equal.";
    return 0;
}
