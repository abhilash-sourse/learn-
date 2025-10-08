#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(){
    srand(time(NULL));


    int guess = 0;
    int tries = 0;
    int min = 1;
    int max = 100;
    int answer = (rand() % (max - min + 1)) + min;

    printf("****NUMBER GUESSING GAME***\n");

    do{
        printf("guess a numer between %d - %d :",min,max);
        scanf("%d",&guess);
        tries++;

        if(guess < answer){
            printf("too low\n");
            break;
        }else if (guess > answer){
            printf("too high\n");
            break;
        }else{
            printf("Corrent!");
            break;
        }
    }while(guess != answer);
    printf("The answer id %d\n",answer);
    printf("it took you %d tries",tries);



    return 0;
}