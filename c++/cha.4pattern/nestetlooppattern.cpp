#include<iostream>
using namespace std;
int main() {
    int m;
    cout<< "enter a number of rows: ";
    cin>>m;
    int n;
    cout<<"enter number of colums: ";
    cin>>n;
    for (int i=1 ; i<=m; i++) {
        for (int j=1; j<=n; j++) {
            cout<<"*";
        }
        cout<<endl;
    }
}