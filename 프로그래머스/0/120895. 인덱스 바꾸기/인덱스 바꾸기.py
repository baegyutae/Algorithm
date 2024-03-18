def solution(my_string, num1, num2):
    # 문자열을 리스트로 변환하여 요소를 변경 가능하도록 함
    string_list = list(my_string)
    
    # 두 인덱스의 문자를 서로 교환
    string_list[num1], string_list[num2] = string_list[num2], string_list[num1]
    
    # 리스트를 문자열로 변환하여 반환
    return ''.join(string_list)