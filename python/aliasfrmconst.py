# Listedeki kelimenin sessiz harflerinden oluşan kısaltmasını üreten program:
wordlist = ["ali", "ayse", "mehmet", "ahmet"]
newwordlist = []

for i in range(len(wordlist)):
    c = ""
    for x in wordlist[i]:
        if x not in "aeiouAEIOU":
            c += x
    newwordlist.append(c)
print wordlist
print newwordlist
