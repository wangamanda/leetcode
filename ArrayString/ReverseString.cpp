#include<iostream>
#include<cstring>
using namespace std;

void Reverse(char* str){
	char* end = str;
	if(str){
		while(*end){
			end++;
		}
		end--;
	}

	char temp;
	char* start = str;
	while(start <= end){
		temp = *start;
		*start = *end;
		*end = temp;
		start++;
		end--;
	}
}

int main(int argc, char** argv){
	cout << argv[1] << endl;
	Reverse(argv[1]);
	cout << argv[1] << endl;
}

