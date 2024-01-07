import java.sql.SQLOutput;

public class fjc_getter_and_setter {
    static class MyEmployee{
      private  int id;
       private String name;
        public String getName(){
            return name;

        }
        public void setName(String n){
           this. name=n;
        }
        public void setId(int i){
           this. id = 1;

        }
        public int getId(){
            return id;
        }
    }
    public static void main(String[] args) {
        MyEmployee harry=new MyEmployee();
     //   harry.id = 56;
     //   harry.name="amu";

        harry.setName("amu");
        harry.setId(56);
        System.out.println(harry.getName());
        System.out.println(harry.getId());
    }
}
