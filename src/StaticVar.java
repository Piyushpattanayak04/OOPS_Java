class StaticVar{
    static int num = 10;
    public void set(){
        num++;
    }
    public void get(){
        System.out.println(num);
    }
}
class main{
    public static void main(String[] args){
        StaticVar ob1 = new StaticVar();
        StaticVar ob2 = new StaticVar();
        StaticVar ob3 = new StaticVar();
        ob1.set();
        ob1.set();
        ob2.set();
        ob3.set();
        ob3.set();
        ob3.set();
        ob1.get();
        ob2.get();
        ob3.get();
    }
}