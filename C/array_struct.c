#include <stdio.h>

// typedef struct{
//     char model[25];
//     int year;
//     int price;
// }Car;

int main(){
    // Car cars[] = {{"Mustang",2025,100000},
    //             {"corvette",2025,200000},
    //             {"challenger",2026,50000}};

    // int number = sizeof(cars) / sizeof(cars[0]);

    // for(int i =0;i < number; i++){
    // printf("%s %d $%d", cars[i].model,cars[i].year,cars[i].price);
    // }

                        //pointer

    int age = 25;
    int *pAge = &age;
    printf("%p\n",&age);          //%p is used to print a pointer address
    printf("%p\n",pAge);                    //* = dereference operator
                        // & = gives you the address

    printf("you age %d years old",age);

    return 0;
}