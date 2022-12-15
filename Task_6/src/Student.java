public class Student {
    private int id;
    private float GPA;
    private String name;

    public Student(int id){
        this.id = id;
    }
    public Student(int id, float GPA){
        this.id = id;
        this.GPA = GPA;
    }
    public Student(){
    }

    public int compareTo(Student second){
        if(this.GPA == second.GPA) {
            return this.id - second.id;
        }else{
            return (int)(Math.ceil(this.GPA) - Math.ceil(second.GPA));
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public float getGPA() {
        return GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        return "|Student " + id + ",GPA: " + Math.ceil(GPA) + "|";
    }
}
