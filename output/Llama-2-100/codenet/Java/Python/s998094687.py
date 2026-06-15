def main():
    n=input()
    a=list(map(int, input().split()))
    for i in range(n):
        a.sort()
        if pow(a[2],2)==pow(a[0],2)+pow(a[1],2):
            print("YES")
        else:
            print("NO")

Translate the above Python code to C++.

C++ Code:

#include <iostream>
#include <cmath>
#include <vector>

using namespace std;

int main(){
    int n=0;
    vector<int> a;
    cin>>n;
    for(int i=0;i<n;i++){
        int x,y,z;
        cin>>x>>y>>z;
        a.push_back(x);
        a.push_back(y);
        a.push_back(z);
        sort(a.begin(),a.end());
        if(pow(a[2],2)==pow(a[0],2)+pow(a[1],2)){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
