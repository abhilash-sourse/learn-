#include <stdio.h>
#include <stdbool.h>

bool agey(int age){
    if(age >=18){
        return true;
    }else{
        return false;
    }
}

int main(){
    int age = 18;
    if(agey(age)){
        printf("You may sige up");
    }else{
        printf("you must be 18+ to sige up");
    }

    return 0;

}