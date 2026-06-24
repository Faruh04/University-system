import java.util.ArrayList;

public class subject {
    private static int nextId = 1;

        int id;
        String name;
        ArrayList<Integer> teacherIds;

    public subject (String _name, ArrayList<Integer> _teacherIds)
    {
        this.id = nextId++;
        this.name = _name;
        this.teacherIds = _teacherIds;
    }

}