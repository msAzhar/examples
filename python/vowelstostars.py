# Listedeki kelimenin sesli harflerini yıldıza çevirme:
wordlist = ["ali", "ayse", "mehmet", "ahmet"]
newwordlist = []
for i in range(len(wordlist)):

    y = ""
    for x in wordlist[i]:
        if x in "aeiouAEIOU":
            y += '*'
        else:
            y += x

    newwordlist.append(y)

print wordlist
print newwordlist
