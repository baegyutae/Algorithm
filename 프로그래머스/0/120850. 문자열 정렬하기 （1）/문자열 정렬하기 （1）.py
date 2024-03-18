def solution(my_string):
    # 숫자를 담을 리스트 생성
    numbers = []
    
    # 문자열을 순회하며 숫자인 경우 numbers 리스트에 추가
    for char in my_string:
        if char.isdigit():
            numbers.append(int(char))
    
    # 숫자를 오름차순으로 정렬
    numbers.sort()
    
    return numbers