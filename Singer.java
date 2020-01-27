public class Singer{
    public String name;
    public int age;
    public String nationality;
    public double salary;

public void printSinger(){
    System.out.println(name);
    System.out.println(age);
    System.out.println(nationality);
    System.out.println(salary);
}
public Singer(String n, int a, String t, double s){
    name=n;
    age=a;
    nationality=t;
    salary=s;
    }
}