#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
    srand(time(NULL));
                 // int randomNum = rand() % 2;
                 // printf("%d",randomNum);


    int min = 10;
    int max = 60;

    int randomNum = (rand() %(max - max + 1))  + min;

    printf("%d", randomNum);


    return 0;
}