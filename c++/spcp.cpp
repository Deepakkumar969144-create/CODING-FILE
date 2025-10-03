#include<iostream>
using namespace std;
int main() {

    //cp - cost price , sp-seling price --- if(sp>cp)
    // sp>cp - sp-cp--- if(sp>cp)
    // cp<sp - cp-sp --- (cp<sp)
    // cp==sp - no pro. no loss---(cp==sp)

int cp;
cout<<"enter cost price : ";
cin>>cp; 
int sp; 
cout <<"enter selling price: ";
cin >>sp;
if( sp>cp){
    cout<<"profit";}
    if (sp<cp) {
        cout <<"loss "; }
        if (sp==cp) {
            cout <<"no prifit no loss ";

        }
//and  

int cp;
cout<<"enter cost price : ";
cin>>cp;
int sp;
cout<<"enter selling price: ";
cin>>sp;
if (sp>cp){
    cout<<"profit";

}
else if (sp<cp){
    cout <<"loss";
}
else{
    cout <<"no profit no loss ";

}

// and 


int cp;
cout<<"enter cost proce : ";
cin>>cp;
int sp; 
cout <<"enter selling price: ";
cin>>sp;
if (sp>cp){
    cout <<"profit is "<<sp-cp;
}
else if (sp<cp){
    cout <<"loss is "<<cp-sp;

}
else{
    cout <<"no profit no loss ";
}


    }
