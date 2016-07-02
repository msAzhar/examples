class Queue:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def enqueue(self, item):
        self.items.insert(0,item)

    def dequeue(self):
        return self.items.pop()

    def size(self):
        return len(self.items)
    
    def ilk_eklenen(self):
	return self.items[len(self.items)-1]

q=Queue()
q.enqueue(5)
q.enqueue(4)
q.enqueue(3)
q.enqueue(2)
print q.size()
print q.ilk_eklenen()
