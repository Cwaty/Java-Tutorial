import java.util.Scanner;

public class Employee {
    public int id;
    public String name;
    public String email;

    public void thisInfo(){
        System.out.println("Name: "+this.name+" | ID: "+this.id+" | Mail: "+this.email+"");
    }
    public Employee(int id, String name , String email){
this.id = id;
this.name = name;
this.email = email;
}

public int GET_ID(){
        return id;
}
public String GET_NAME(){
        return name;
}

public void SET_ID(int id){
        if(id > 100) {
            this.id = 100;
        } else {
            this.id = id;
        }
}

}
