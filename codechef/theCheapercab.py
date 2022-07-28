for _ in range(int(input())):
    a,b=map(int,input().split())
    if a<b:
        print("FIRST")
    elif b<a:
        print("SECOND")
    else:
        print("ANY")
