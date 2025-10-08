#include <stdio.h>

// int add(int x, int y){
//     int result = x + y;
//     return result;
// }

int sub(int x, int y){
    int result = x - y;
    return result;
}

int main(){
    int result = sub(3,4);
    printf("%d",result);
    return 0;
}