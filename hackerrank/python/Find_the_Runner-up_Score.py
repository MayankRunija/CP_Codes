if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    l = []
    for i in arr:
        l.append(i)
    mx = max(l)
    a = []
    while mx in l:    
        l.remove(mx)
    print(max(l))

#with if else
if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr2 = sorted(arr, reverse=True)
    for i,x in enumerate(arr2):
        if max(arr2)==arr2[i]:
            pass
        else:
            print(x)
            break
