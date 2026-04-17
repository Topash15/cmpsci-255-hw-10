public class graphTest
{
    public static void main(String[] args)
    {
        graph gr = new graph();

		gr.add_vertex(0);
		gr.add_vertex(1);
		gr.add_vertex(2);
		gr.add_vertex(3);
		gr.add_vertex(4);
		gr.add_vertex(5);
		gr.add_vertex(6);
		gr.add_vertex(7);
		gr.add_vertex(8);

		gr.add_edge(0, 2);
		gr.add_edge(2, 5);
		gr.add_edge(2, 4);
		gr.add_edge(7, 5);
		gr.add_edge(7, 6);
		gr.add_edge(7, 4);
		gr.add_edge(7, 8);
		gr.add_edge(0, 1);
		gr.add_edge(1, 3);
		gr.add_edge(6, 3);
		gr.add_edge(6, 8);

		System.out.println("Adjacency list view: ");
		gr.print();
		System.out.print("\nBreadth-first traversal starting from 8: ");
		gr.print_BF(8);
        System.out.println();
		System.out.print("Depth-first traversal starting from 8: ");
		gr.print_DF(8);
		System.out.println();
    }
}

/*
if your program is implemented correctly, it should display:

Adjacency list view: 
Adjacency list view:
Vertex 0: 2 1
Vertex 1: 0 3
Vertex 2: 0 5 4
Vertex 3: 1 6
Vertex 4: 2 7
Vertex 5: 2 7
Vertex 6: 7 3 8
Vertex 7: 5 6 4 8
Vertex 8: 7 6

Breadth-first traversal starting from 8: 8 7 6 5 4 3 2 1 0
Depth-first traversal starting from 8: 8 7 5 2 0 1 3 6 4

*/
