# 두 개 뽑아서 더하기

numbers = list(map(int, input().split()))
length = len(numbers)
answer = []
for index in range(length - 1):
    for another_index in range(index+1, length):
        index_sum = numbers[index] + numbers[another_index]
        if index_sum not in answer:
            answer.append(index_sum)
answer.sort()
print(answer)