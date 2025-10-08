#include <stdio.h>
#include <stdbool.h>


int main(){

    // && = AND
    // || = OR
    // ! = NOT

    // int temp = 10000;
    // if(temp > 0 && temp < 30){
    // if(temp > 0 || temp < 30){
    //     printf("The temperature is GOOD");
    // }else{
    //     printf("The temperature is BAD");
    // }

    bool isSunny = true;

    if(!isSunny){
        printf("It is cloudy outside");
    }else{
        printf("it is sunny outside");
    }



    return 0;
}