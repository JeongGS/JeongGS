# -*-coding: utf-8-*-
money, c500, c100 ,c50 ,c10 = 0,0,0,0,0

money=int(input("교환할 돈은 얼마?"))
c500 = money // 500
money = money % 500
c100 = money // 100
money = money % 100
c50 = money // 50
money = money % 50
c10 = money // 10
money = money % 10

print("\n오백원짜리 ==> %d 개 " % c500)
print("백원짜리 ==> %d 개 "  % c100)
print("오십원짜리 ==> %d 개 " % c50)
print("십원짜리 ==> %d 개 " % c10)
