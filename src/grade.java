public class grade {

    private static int next_id = 123;


    int id;
    int student_id;
    int section_id;
    float value;

        public grade(
                int _student_id,
                int _section_id,
                float _value
        ){
            this.id = next_id++;
            this.student_id = _student_id;
            this.section_id = _section_id;
            this.value = _value;
        }
}
