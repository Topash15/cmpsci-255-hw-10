import java.util.ArrayList;

public class vertex
{
    public ArrayList edge_list;
    public boolean marked;
    public int id;
    
    public vertex(int id)
    {
        this.edge_list = new ArrayList();
	this.marked = false;
        this.id = id;
    }
}
