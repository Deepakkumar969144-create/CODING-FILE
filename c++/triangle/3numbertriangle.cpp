#include<iostream>
using namespace std;
int main() {
    int a,b,c;
    cout<<"enter 1st side: ";
    cin>>a;
    cout<<"enter 2nd side: ";
    cin>>b;
    cout<<"enter 3rd side: ";
    cin>>c;
    if((a+b)> c and (b+c)>a and (a+c)>b){
        cout<<"valid triangle";
    }
    else{
        cout<<"invalid triangle ";
    }
    //triangle --
    // a+b>c
    // b+c>a
    // c+a>b
    // if((a+b)>c and (c+b)>b and (c+a)>b)
}