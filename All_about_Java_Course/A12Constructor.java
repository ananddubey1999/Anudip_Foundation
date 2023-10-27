class ClassMain{
        int a ; String name ; // instatnt variable


    ClassMain(){
       a=0; name=null;    // this is constructor which is defaulted in every java class 
    }                      // agr ye hata bhi du na to bhi code same ouptup dega


    void shows()        // ye ek alag hi viod mathod hai show krane ke liye
    {
    System.out.println(a+""+name);
    }
}

public class A12Constructor {
    public static void main(String[] args) {
       ClassMain abc = new ClassMain();

        abc.shows();
    }
}

// constructor is a special type of method whose name is same as class name