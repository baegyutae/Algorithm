#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <string.h>

char* solution(const char* phone_number) {
    int length = strlen(phone_number);
    

    char* answer = (char*)malloc(length + 1);
    
    for (int i = 0; i < length; i++) {
        if (i < length - 4) {
            answer[i] = '*';
        } else {
            answer[i] = phone_number[i];
        }
    }
    
    answer[length] = '\0';
    
    return answer;
}

int main() {
    const char* phone_number = "01012345678";
    char* result = solution(phone_number);
    printf("%s\n", result);
    
    free(result);

    return 0;
}
