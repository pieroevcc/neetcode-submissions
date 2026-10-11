class Solution:
    def networkDelayTime(self, times: List[List[int]], n: int, k: int) -> int:
        adj_list = defaultdict(list)
        for u, v, weight in times:
            adj_list[u].append((v, weight))
        dist = [float('inf')] * (n+1)
        dist[k] = 0
        heap = [(0,k)]
        while heap:
            curr, u = heapq.heappop(heap)
            if curr > dist[u]:
                continue
            for v, weight in adj_list[u]:
                if dist[u] + weight < dist[v]:
                    dist[v] = dist[u] + weight
                    heapq.heappush(heap, (dist[v], v))
        max_delay = max(dist[1:])
        return max_delay if max_delay != float('inf') else -1
