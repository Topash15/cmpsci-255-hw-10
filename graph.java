import java.util.HashMap;
import java.util.ArrayList;
import java.util.ArrayDeque;

//undirected graph
public class graph
{
    private HashMap<Integer, vertex> vertices;

    public graph()
    {
        vertices = new HashMap();
    }
	
    public void add_vertex(int id)
    {
        vertex new_vertex = new vertex(id);
	vertices.put(id, new_vertex);
    }
	
    public void add_edge(int id_1, int id_2)
    {
        vertex v1 = (vertex)vertices.get(id_1);
        vertex v2 = (vertex)vertices.get(id_2);
        v1.edge_list.add(id_2);
	v2.edge_list.add(id_1);
    }
	
    public void print()
    {
        for (int id : vertices.keySet())
        {
            System.out.print("Vertex " + id + ": ");
		
            vertex v = vertices.get(id);
            ArrayList al = v.edge_list;
            for(int i=0; i<al.size(); i++)
            {
                System.out.print(al.get(i) + " ");
            }
            System.out.println();
        }
    }
	
    public void print_BF(int vid)
    {
        for (int id : vertices.keySet())
        {
            vertices.get(id).marked = false;
        }

	ArrayDeque<Integer> Q = new ArrayDeque();
	vertices.get(vid).marked = true;
	System.out.print(vid + " ");
	Q.add(vid);
        
	while(!Q.isEmpty())
	{
            // your code goes here:
            /*
            1. remove one element (an vertex ID) from Q
            2. get the vertex based on the vertex ID
            3. look through the edge_list of this vertex
            4. for every adjencent vertex in the list
                if it has not been marked: 
                    a. mark it
                    b. dispay it
                    c. add it to Q
                if it has been marked, do nothing.
            */
	}
    }
    
    public void print_DF(int vid)
    {
        for (int id : vertices.keySet())
        {
            vertices.get(id).marked = false;
        }

        recursive_print_DF(vid);
    }
    
    public void recursive_print_DF(int x)
    {
        // following depth-first traversal algorithm
        // to print all vertices starting from vertex ID x.
    }
}
