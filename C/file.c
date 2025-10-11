#include <stdio.h>
int main(){

                    //write a file

    // FILE *pFile = fopen("output.txt","w");
    // char text[] = "i an abhilash\n how are you......";

    // if(pFile == NULL){
    //     printf("Error opening file\n");
    //     return 1;
    // }

    // fprintf(pFile, "%s" , text);
    // printf("File was written successfully!\n");
    // fclose(pFile);



    FILE *pFile = fopen("output.txt","r");
    char text[1024] = {0};

    if(pFile == NULL){
        printf("could not open file\n");
        return 1;
    }

    while(fgets(text, sizeof(text),pFile) != NULL){
        printf("%s",text);
    }
    fclose(pFile);


    return 0;
}