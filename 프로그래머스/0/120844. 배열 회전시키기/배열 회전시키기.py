def solution(numbers, direction):
    n = len(numbers)
    if direction == "left":
        return numbers[1:] + [numbers[0]]
    elif direction == "right":
        return [numbers[n-1]] + numbers[:n-1]