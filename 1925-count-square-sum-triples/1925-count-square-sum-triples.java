class Solution {
    public int countTriples(int n) {
       Set<Integer> squares = new HashSet<>();
	   for (int i = 1; i <= n; i++)
		   squares.add(i * i);

	   int count = 0;

	   for (int i = 1; i < n; i++)
		  for (int j = i; i * i + j * j <= n * n; j++)
			if (squares.contains(i * i + j * j))
				count += 2;
	   return count;
    }
}