rows=int(input("Please enter the number of rows"))
for i in range(1,rows):
    for j in range(0,rows-i):
        print(end=" ")
    for k in range(0,i):
        print(end="* ")
    print()


input("please press any key to exit")