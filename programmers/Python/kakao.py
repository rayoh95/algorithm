def solution(s):
    result = s.split("}")
    for idx in result:
        while '{' in idx:
            result[idx] = idx.replace("{","")

    longest = ''
    for idx in result:
        if len(longest) < len(idx):
            longest = idx
    longest.split(',')
    return longest

for tc in range(1):
    test_str = input()
    print(solution(test_str))


# # {{4,2,3},{3},{2,3,4,1},{2,3}}
# 423
# 3
# 2341 의 문자열이 longest 에 저장
# 23

# {{20,111},{111}}
# 20,111
# 111
