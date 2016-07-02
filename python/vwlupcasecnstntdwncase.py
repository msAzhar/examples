# Listedeki kelimenin sesli harflerini büyüten ve sessiz harflerini
# küçülten program:
wordlist = ["ali", "ayse", "mehmet", "ahmet"]
newwordlist = []

for i in range(len(wordlist)):
    l = ""
    for x in wordlist[i]:
        if x in "aeiouAEIOU":
            l += x.upper()
        if x not in "aeiouAEIOU0123456789":
            l += x.lower()
    newwordlist.append(l)

print wordlist
print newwordlist
