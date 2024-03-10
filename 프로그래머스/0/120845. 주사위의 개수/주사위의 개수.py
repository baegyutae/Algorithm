def solution(box, n):
    max_in_width = box[0] // n
    max_in_length = box[1] // n
    max_in_height = box[2] // n
    
    return max_in_width * max_in_length * max_in_height
