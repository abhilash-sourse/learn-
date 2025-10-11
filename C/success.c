#include <stdio.h>
#include <string.h>


typedef enum Status{
    SUCCESS,FAILURE,PENDING
} Status;

void connectStatus(Status status);

int main(){

    Status status = SUCCESS;

    connectStatus(status);


    return 0;
}

void connectStatus(Status status){
    switch (status)
    {
    case SUCCESS:printf("connecting was successfull\n");break;
    case FAILURE : printf("Could not connect\n"); break;
    case PENDING : printf("Connecting....\n"); break;
    }

}