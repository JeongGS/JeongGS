def merge_string(*text_list):
	result =''
	for s in text_list:
		result =result +s
	return result

print('동물명을 입력하세요:')
aname = input()

aa=merge_string(aname)
print('동물명: '+aa)
