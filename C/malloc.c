#include <stdio.h>
#include <stdlib.h>


int main(){
                //malloc

    // int num = 0;
    // printf("Enter the number of grades:");
    // scanf("%d",&num);

    // char *grades = malloc(num * sizeof(char));

    // if(grades == NULL){
    //     printf("Memory allocation failed \n");
    //     return 1;
    // }

    // for (int i = 0; i < num;i++){
    //     printf("Enter grade #%d :",i + 1);
    //     scanf(" %c",&grades[i]);
    // }

    // for (int i = 0; i < num ; i ++){
    //     printf("%c\t",grades[i]);
    // }

    // free(grades);  // renturning rented space back to the os
    // grades = NULL; //avoids dangling pointer



                        //calloc()

    // int num =0;
    // printf("Enter the number of players:");
    // scanf("%d",&num);

    // int *scores = calloc(num , sizeof(int));

    // if(scores == NULL){
    //     printf("memory allocation failed!\n");
    //     return 1;
    // }

    // for(int i = 0;i < num; i++){
    //     printf("Enter score #%d :",i + 1);
    //     scanf("%d",&scores[i]);
    // }

    // for (int i = 0 ; i < num ; i++){
    //     printf("%d ",scores[i]);
    // }

    // free(scores);



                            //realloc()

    int num = 0;
    printf("Enter the number of prices:");
    scanf("%d",&num);

    float *price = malloc(num * sizeof(float));

    if(price == NULL){
        printf("memory allocation failed\n");
        return 1;
    }

    for(int i = 0; i < num; i++){
        printf("Enter price %d :",i + 1);
        scanf("%f",&price);
    }

    int Newnum = 0;
    printf("Enter the new number of prices:");
    scanf("%d",&Newnum);
    

    float *temp = realloc(price , Newnum * sizeof(float));

    if(temp == NULL){
        printf("could not reallocate memory \n");
    }else{
        price = temp;
        temp = NULL;
    }

    for(int i =Newnum ; i < Newnum;i++){
        printf("Enter price #%d : ",i +1);
        scanf("%f",&price[i]);
    }

    for(int i = 0; i < num; i++){
        printf("$%.2f",price[i]);
    }

    free(price);
    price = NULL;

    return 0;
}