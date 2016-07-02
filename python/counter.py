# Listedeki kelimenin içerisindeki
# harf sayısını
# sayı sayısını
# küçük harf sayısını
# sesli harf sayısını
# sessiz harf sayısını ekrana yazdıran program:
wordlist = ["7ali", "1ayse", "3mehmet", "5ahmet"]
countera = 0
countern = 0
counterl = 0
counterv = 0
counterc = 0
for i in range(len(wordlist)):

    for x in wordlist[i]:
        if (x.isalpha() == 1):
            countera += 1
        if (x.isdigit() == 1):
            countern += 1
        if (x.islower() == 1):
            counterl += 1
        if x in "aeiouAEIOU":
            counterv += 1
        if x not in "aeiouAEIOU0123456789":
            counterc += 1


print "Listemiz:", wordlist
print "Listedeki harf sayisi:", countera
print "Listedeki sayi sayisi:", countern
print "Listedeki kucuk harf sayisi:", counterl
print "Listedeki sesli harf sayisi:", counterv
print "Listedeki sessiz harf sayisi:", counterc
