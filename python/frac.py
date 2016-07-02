class Fraction:
	def __init__(self,pay,payda):
		self.num = pay
		self.den = payda

	def __str__(self):
		return str(self.num) + "/" + str(self.den)
f=Fraction(2,3)
print f
