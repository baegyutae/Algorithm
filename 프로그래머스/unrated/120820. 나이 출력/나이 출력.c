#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int age) {
    int answer = 2022;
    int birthYear = answer - age + 1;
    return birthYear;
}