package SingletonClass;

public class SingletonClassExample {


    private static SingletonClassExample Singleton_instance= null;
    public String str;
    private SingletonClassExample()
    {
        str="This is java program";
    }
    public static SingletonClassExample getInstance()
    {
        if (Singleton_instance==null)
            Singleton_instance=new SingletonClassExample();
        return Singleton_instance;
    }
    public static void main(String[] args) {

        SingletonClassExample a= SingletonClassExample.getInstance();
        SingletonClassExample b= SingletonClassExample.getInstance();
        SingletonClassExample c= SingletonClassExample.getInstance();

        a.str= (a.str).toUpperCase();
        System.out.println(a.str);
        System.out.println(b.str);
        System.out.println(c.str);

    }
}
