public class Player{
    // atributes (only use this for Datatype style not constructor)
    private String name;
    public int age;
    public String nationality;
    public double salary;

    // methods
    // visibility dataTypeReturn nameMethod (parameters){code of method};

    public void printPlayer(){
        System.out.println("------------------");
        System.out.println(name);
        System.out.println(age);
        System.out.println(nationality);
        System.out.println(salary);
    }

    // setters and getters ; when your data is private
    // visibility dataTypeReturn nameMethod (parameters){ code of method}
    public void setName(String n){
        //if(age<100>0)
        name=n;
    }
    //Geetter for private data code
    public String getName(){
        return name;
    }

    //Contructor special method to create objects
    //visibility nameMethod
    //Option1 for contructor to add only this lines use the following code:
    //public Player(){
    //System.out.println("Creating an object....");
        
    //Option 2 the following code to construct:
    public Player(String n, int a, String t, double s){
        name=n;
        age=a;
        nationality=t;
        salary=s;
    }
    
}