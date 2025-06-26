class Solution:
    def mostFrequentEven(self, nums: List[int]) -> int:
        nums.sort()
        freq = {}
        for num in nums:
            if num % 2 == 0:
                freq[num] = freq.get(num, 0) + 1
        
        most_frequent = -1
        max_count = 0
        for key, count in freq.items():
            if count > max_count or (count == max_count and key < most_frequent):
                most_frequent = key
                max_count = count
                
        return most_frequent