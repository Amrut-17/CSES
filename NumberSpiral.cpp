#include<iostream>
using namespace std;
 
int main()
{
    long long int t, y, x;
    cin >> t;
    for(int i=0; i<t; i++)
    {
        cin >> y >> x;
        long long int answer;
            if (x>y){
                if (x%2 != 0){
                    answer = (x*x)-y+1;
                }else {
                    answer = ((x-1)*(x-1))+y;
                }
            }else {
                if (y%2 != 0){
                    answer = ((y-1)*(y-1))+x;
                }else {
                    answer = (y*y)-x+1;
                }
            }
            cout << answer << "\n";
    }
}
