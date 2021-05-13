package site.ffrfree.pojo;

public class Teacher {
    private int teacherId;
    private int name;

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", name=" + name +
                '}';
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
