import java.util.ArrayList;

public class section {

    private static int next_id = 123;


        int id;
        int subject_id;
        String name;
        String day;
        String time;
        String room;
        ArrayList<Integer> student_ids;



    public section(

            int _subject_id,
            String _name,
            String _day,
            String _time,
            String _room,
            ArrayList<Integer> _student_ids

    ){

            this.id = next_id++;
            this.subject_id = _subject_id;
            this.name = _name;
            this.day = _day;
            this.time = _time;
            this.room = _room;
            this.student_ids = _student_ids;

    }

}
