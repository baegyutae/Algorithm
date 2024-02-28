def solution(my_string):
    vowels = 'aeiou'  # 모음을 나타내는 문자열
    answer = ''  # 결과를 저장할 변수

    # 문자열을 순회하면서
    for char in my_string:
        # 만약 현재 문자가 모음이 아니면 결과에 추가
        if char not in vowels:
            answer += char
    
    return answer
