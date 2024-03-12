def solution(numbers):
    max_product = float('-inf')  # 최댓값을 음의 무한대로 초기화합니다.
    
    # 모든 숫자 쌍을 비교하여 최댓값을 찾습니다.
    for i in range(len(numbers)):
        for j in range(i + 1, len(numbers)):
            product = numbers[i] * numbers[j]
            if product > max_product:
                max_product = product
                
    return max_product