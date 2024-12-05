from typing import List

class Solution:
    def findRadius(self, houses: List[int], heaters: List[int]) -> int:
        # Sort both houses and heaters for easier calculation
        houses.sort()
        heaters.sort()
        
        def find_closest_heater(house):
            # Binary search to find the closest heater to the given house
            left, right = 0, len(heaters) - 1
            while left <= right:
                mid = (left + right) // 2
                if heaters[mid] == house:
                    return 0  # Exact match
                elif heaters[mid] < house:
                    left = mid + 1
                else:
                    right = mid - 1
            # Compute distances to the nearest two heaters (if they exist)
            dist1 = abs(house - heaters[right]) if right >= 0 else float('inf')
            dist2 = abs(house - heaters[left]) if left < len(heaters) else float('inf')
            return min(dist1, dist2)
        
        # Compute the maximum radius required to cover all houses
        max_radius = 0
        for house in houses:
            max_radius = max(max_radius, find_closest_heater(house))
        
        return max_radius
