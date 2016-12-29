#include<iostream>
using namespace std;
//this is coded by vipul kumar maurya
/* the following code will print below pattern  for odd numbers . it was coding round question for Webkul Soft.
//example of n=7.
*
**
***
****@
*** @
**  @
*   @   *
    @  ** 
    @ ***
    @****
      ***
       **
        *

*/


int main(){
	int n,x;
	cout<<"enter the digit to print pattern.\n";
	cin>>x;
	if(x%2!=0 && x>2){
		n=x/2;
	}
	else{
	
	cout<<"Enter the odd digit above 2: \n";
	return 0;
}
for(int i=0;i<n;i++){
	for(int j=0;j<=i;j++){
		cout<<"*";
		}
		cout<<"\n";
}

//
for(int i=0;i<=n;i++){
	for(int j=n;j>=i;j--){
		cout<<"*";
	}
	for(int k=0;k<i;k++){
		cout<<" ";
	}
	cout<<"@";
if(i<n)
	cout<<"\n";
	else
	continue;
	
}
//



for(int i=0;i<n;i++){
	
//	
	
	for(int l=n;l>i;l--)
	{ cout<<" ";
	}
	for(int t=0;t<=i;t++){
		cout<<"*";
	}
cout<<"\n";
for(int j=0;j<=n;j++){
		cout<<" ";
	}
cout<<"@";
	}
//


for(int i=0;i<=n;i++){
	
	for(int b=0;b<i;b++){
		cout<<" ";
	}
	for(int k=n;k>=i;k--){
		cout<<"*";
	}

cout<<"\n";
	for(int j=0;j<=n+1;j++){
		
		cout<<" ";
	}
}
}
	

