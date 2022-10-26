#include <iostream>
#include <vector>
#include <stack>
using namespace std;
void addEdge(vector<int> adj[], int u, int v)
{
  adj[u].push_back(v);
}
void dfs1(vector<int> adj[], int u, stack<int> &st, bool visited[])
{
  visited[u] = true;
  for (int v : adj[u])
  {
    if (visited[v] == false)
    {
      dfs1(adj, v, st, visited);
    }
  }
  st.push(u);
}
void dfs2(vector<int> adj[], int u, bool visited[])
{
  visited[u] = true;
  cout << u << " ";
  for (int v : adj[u])
  {
    if (visited[v] == false)
    {
      dfs2(adj, v, visited);
    }
  }
}
int main()
{
  int v = 4;
  vector<int> adj[v + 1];
  addEdge(adj, 1, 2);
  addEdge(adj, 2, 1);
  addEdge(adj, 1, 3);
  addEdge(adj, 2, 4);
  stack<int> st;
  bool visited[v + 1];
  for (int i = 0; i <= v; i++)
    visited[i] = false;
  for (int i = 1; i <= v; i++)
  {
    if (visited[i] == false)
      dfs1(adj, i, st, visited);
  }
  // Reverse the Edges
  vector<int> adjTrans[v + 1];
  for (int i = 1; i <= v; i++)
  {
    for (int u : adj[i])
    {
      addEdge(adjTrans, u, i);
    }
  }
  for (int i = 0; i <= v; i++)
    visited[i] = false;
  // Print strongly Connected Components
  while (!st.empty())
  {
    int u = st.top();
    st.pop();
    if (visited[u] == false)
    {
      dfs2(adjTrans, u, visited);
      cout << endl;
    }
  }
}
