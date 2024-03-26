#include<stdio.h>

// void _start()
// {
//     printf("Hello This the Program without main Function");

//     _exit(0);
// }


int main()
{
    int  a= 0001;
    printf("%o\n",a);       // o/p  : 1
    printf("%d\n",a);       // o/p  : 1
    printf("%i\n",a);       // o/p  : 1
    printf("%04d\n",a);     // o/p  : 0001
    int b = 10e2;
    printf("B : %d\n",b);
    int *p = &b;
    printf("%p\n",(void *)p);
    printf("%p\n",(void *)&b);
     int variable = 42;
    int *pointer = &variable;

    printf("Address of variable: %p\n", (void*)&variable);
    printf("Address stored in pointer: %p\n", (void*)pointer);
    return 0;

}