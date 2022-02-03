# 완주하지 못한 선수

participant = list(input().split())
completion = list(input().split())

print(set(participant))
print(set(completion))
failer_list=list(set(participant)-set(completion))
if failer_list==[]:
    for people in completion:
        participant.remove(people)
    failer="".join(participant)
    
else:
    failer="".join(failer_list)
    
print(failer)