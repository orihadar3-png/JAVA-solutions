public class person {
    private  String name="--";
    private  int  age=0;
    public person(){
        this.name="xxx";
        this.age=0;
    }
    public person(int age){
       // this.name=name;
        this.age=age;
    }
    public person(String name){
        this.name=name;
        this.age=0;
    }
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }





    public  void setName(String name){  //  48 - 57     97 --122
        for(int i=0;i<name.length();i++){
            int temp=name.charAt(i);
            if(temp<97||temp>122) {
                this.name = "---";
                return;
            }
        }
        this.name=name;
    }
    public void setAge(int age){
        if(age>0&&age<120)
            this.age=age;
    }
    public String getName(){
        return  this.name;
    }
    public int getage(){
        return  this.age;
    }
    public String status(){
         return  toString();
    }
    /*
    public  String  toString(){
        return   (name + " " + age);
    }

     */
}
