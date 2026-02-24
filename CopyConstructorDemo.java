 class Student1 {
    String name;
    int usn;
    //Traditional Constructor
     Student1(String name,int usn) {
        this.name = name;
        this.usn = usn;
    }
        //Copy Constructor
        Student1(Student1 s){
            this.name = s.name;
            this.usn = s.usn;
    }
    void display(){
        System.out.println(name+"  "+usn);
    }
}
 class Driver2{
    public static void main(String[] args){
        Student1 s1= new Student1("Liki",123);
        Student1 s2 = new Student1(s1);
        s1.display();
        s2.display();
    }
 }