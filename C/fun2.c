#include <stdio.h>
#include <stdbool.h>

void hello(char name[], int age); //function prototype
bool ageCheck(int age);

int main(){
    hello("Abhilash",30);

    if(ageCheck(14)){
        printf("you are old enough to work at the krusty krab");
    }else{
        printf("you must be 16");
    }
    return 0;
}

void hello(char name[],int age){
    printf("Hello %s\n",name);
    printf("\nyou are %d years old",age);
}

bool ageCheck(int age) {
    if (age >= 16)
        return true;
    else
        return false;
}