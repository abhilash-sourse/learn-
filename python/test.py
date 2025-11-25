ln = []
n = int(input("Enter the number of values to be into a list"))
sun = 0
sumstd=0
for i in range(n):
    v = int(input("Enter"))
    ln.append(v)
print("element",ln)
for i in range(ln):
    sum = sum+ln[i]
mean = sum/n
print("s",mean)
for i in range(n):
    