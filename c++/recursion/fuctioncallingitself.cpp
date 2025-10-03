#include<iostream>
#include <cmath>
using namespace std;
void greet() {
    cout <<"hey "<<endl;
    greet();
    
}
int main(){
    greet ();
}