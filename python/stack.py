class Stack:

	     def __init__(self):
	         self.items = []

	     def isEmpty(self):
	         return self.items == []

	     def push(self, item):
	         self.items.insert(0, item)

	     def pop(self):
	         return self.items.pop(0)

	     def peek(self):
	         return self.items[0]

	     def size(self):
	         return len(self.items)

s = Stack()
s.push('hello')
s.push('true')
print(s.pop())
print (s.isEmpty())
s.push(4)
s.push('dog')
print(s.peek())
s.push(True)
print(s.size())
print(s.isEmpty())
s.push(8.4)
print(s.pop())
print(s.pop())
print(s.pop())
print(s.size())


