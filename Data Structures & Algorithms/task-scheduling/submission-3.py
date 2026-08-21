class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        count = Counter(tasks)
        freq = count.values()
        maxf = max(freq)
        maxCount = 0
        for i in freq:
            maxCount += 1 if i == maxf else 0
        time = (maxf - 1)*(n+1) + maxCount
        return max(len(tasks), time)

            
