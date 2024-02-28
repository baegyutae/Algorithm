def solution(array):
    # 배열을 오름차순으로 정렬
    array.sort()
    
    # 배열의 중앙 인덱스 계산
    mid_index = len(array) // 2
    
    # 중앙값 반환
    return array[mid_index]
