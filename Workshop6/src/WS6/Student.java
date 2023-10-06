
package WS6;
public class Student {
    private String code = "";
    private String name = "";
    private int mark = 0;

    // Constructors
    public Student() {
    }

    public Student(String code, String name, int mark) {
        this.code = code.toUpperCase();
        this.name = name.toUpperCase();
        this.mark = (mark >= 0 && mark <= 10) ? mark : 0;
    }

    // Get data as a string for printing
    @Override
    public String toString() {
        return code + ", " + name + ", " + mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code.trim().toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim().toUpperCase();
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        }
    }


}
