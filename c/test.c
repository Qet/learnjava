#include <stdio.h>

void pp(int*);

void pp(int* x){
    printf("PP ref: %x\n", x);
    (*x)++;
}


void main(){

    int x = 3;
    printf("Main x ref: %x\n", &x);
    printf("x = %d\n", x);
    pp(&x);
    printf("x = %d\n", x);

}
