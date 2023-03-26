#include <stdio.h>
int main(){
	printf("enter the marks of a student \n");
	int eng, math, science, hindi,total, aggregate;
	printf("enter the marks of eng :");
	scanf("%d ",&eng);
		printf("enter the marks of math :");
			scanf("%d \n",&math);
			printf("enter the marks of science :");
				scanf("%d \n",&science);
				printf("enter the marks of hindi :");
					scanf("%d \n",&hindi);
					total= eng+math+science+hindi;
					aggregate = (total/4);
					if(aggregate>=90){
					printf("A");
					}
					else if(aggregate>=80 && aggregate<90){
					printf("B");
					}
					else if(aggregate>=70 && aggregate<80){
					printf("C");
					}
					else if(aggregate>=40 && aggregate<70){
					printf("D");
					}
					else if(aggregate<40 ){
					printf("E");
					}
				}
					