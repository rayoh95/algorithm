# View

def second_maximum(a,b,c,d):
    max = 0
    arr = [a,b,c,d]
    for i in arr:
        if i > max:
            max = i
    return max
           
for test_case in range(10):
    view = 0
    buildings = int(input())
    building_arr = list(map(int, input().split()))
    for idx in range(2, buildings - 3):
        max = 0
        for i in range(5):
            if building_arr[idx-2+i] > max:
                max = building_arr[idx-2+i]
        if max == building_arr[idx]:
            view += max - second_maximum(building_arr[idx-2], building_arr[idx-1], building_arr[idx+1], building_arr[idx+2])
        # print(max)
        # print(second_maximum(building_arr[idx-2], building_arr[idx-1], building_arr[idx+1], building_arr[idx+2]))
        # print("여기서부터는 다음 케이스 입니다")
    print(f'#{test_case + 1} {view}')

