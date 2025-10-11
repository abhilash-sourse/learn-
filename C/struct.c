#include <stdio.h>
#include <stdbool.h>
typedef struct {
    char name[30];
    int age;
    float cgp;
    bool isFullTime;
}Student;

int main(){

    Student s1 = {"Abhi",19,9.8,true};

    printf("%s\n",s1.name);
    printf("%d\n",s1.age);
    printf("%f\n",s1.cgp);
    printf("%s\n",(s1.name) ? "YES" : "NO");



    return 0;
}