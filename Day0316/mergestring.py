def merge_string(*text_list):
	result = ''
	for s in text_list:
		result = result + s
	return result

suma =""
#while True:
#  print("문자열 입력: ")
#  solar = input()
#  if solar == "":
#    break
#  suma= suma + merge_string(solar)
#print ("합친 문자열: ", suma)

for i in range(100):
    print("문자열 입력: ")
    solar = input()
    if solar =="":
        break;
    if suma !="": suma = suma+" "
    suma = suma + solar
print("합친 문자열: ", suma)

    