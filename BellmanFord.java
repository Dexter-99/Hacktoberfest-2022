class BellmanFord
{
	public int[][] adj_matrix; // Adjacency Matrix
	public int N; // Total number of vertices
	public int[] distances; // Will store the distances
	public final int max = Integer.MAX_VALUE;

	public BellmanFord(int n, int[][] a)
	{ // Constructor  n : Total number of vertices  a : Adjacency Matrix
		N = n;
		adj_matrix = new int[N][N];
		adj_matrix = a;
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(i == j)
				{
					adj_matrix[i][j] = 0;
					continue;
				}
				if(adj_matrix[i][j] == 0)
				{
					adj_matrix[i][j] = max;
				}
			}
		}
		distances = new int[N];
	}

	public int[] BellmanFord(int s)
	{ // To compute the shortest paths from a souce vertex to all other vertices using the Bellman-Ford algorithm  s : Source Vertex
		for(int vertex = 0; vertex < N; vertex++)
		{
			distances[vertex] = max;
		}
		distances[s] = 0;

		for(int vertex = 0; vertex < N - 1; vertex++)
		{
			for(int sourcevertex = 0; sourcevertex < N; sourcevertex++)
			{
				for(int destinationvertex = 0; destinationvertex < N; destinationvertex++)
				{
					if(adj_matrix[sourcevertex][destinationvertex] != max)
					{
						if(distances[destinationvertex] > (distances[sourcevertex] + adj_matrix[sourcevertex][destinationvertex]))
						{
							distances[destinationvertex] = distances[sourcevertex] + adj_matrix[sourcevertex][destinationvertex];
						}
					}
				}
			}
		}

		for(int sourcevertex = 0; sourcevertex < N; sourcevertex++)
		{
			for(int destinationvertex = 0; destinationvertex < N; destinationvertex++)
			{
				if(adj_matrix[sourcevertex][destinationvertex] != max)
				{
					if(distances[destinationvertex] > distances[sourcevertex] + adj_matrix[sourcevertex][destinationvertex])
					{
						System.out.println("The Graph contains negative egde cycle");
					}
				}
			}
		}

		return distances; // Returning the shortest distances. distances[i] represent the shortest distance distance from vertex s to vertex i
	}
}