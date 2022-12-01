
package data;


public class Student {
    private String code;
    private String name;
    private double mark;
    
    public Student() {
        
    }
    
    public Student(String code, String name, double mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim().toUpperCase();
        if(name.length() > 0)
            this.name = name;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        if (mark >= 0 && mark <= 10)
            this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", mark=" + mark + '}';
    }
    
    public void showProfile() {
        System.out.printf("|%-4s|%-25s|%4.2f|\n", code, name, mark);
    }
}
