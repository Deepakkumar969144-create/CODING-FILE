#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"enter number a rows: ";
    cin>>n;
    for(int i=1; i<=n; i++) {
        for( int j=1; i<=i; j++) {
            if ((i+j)%2==0) cout<<1<<" ";
            else cout<<0<<" ";
        }
        cout<<endl;
        
    }
    
}