print("반복횟수를 입력하세요.")
limit= int(input())
for i in range(limit,0, -1):
    for j in range(i):
	    print("*", end="",)
    print()