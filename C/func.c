#include <stdio.h>

void happy(char name[] , int age){
    printf(" i am abhi");
    printf("\nhello %s",name);
    printf("\nyoue are %d years old",age);
}

int main(){

    char name[25] = "";
    int age;

    printf("Enter your name :");
    fgets(name,sizeof(name),stdin);
    name[strlen(name) - 1] = '\0';

    printf("Enter your age:");
    scanf("%s",age);


    happy(name,age);
    return 0;
}