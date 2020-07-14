package basic;

public class LearnConst {
    int age;
    String add;

    public LearnConst() {
        System.out.println("this is my default Constructor");

    }

    public LearnConst(int age, String add) {
        System.out.println("My Age is " + age);
        System.out.println("My Address is " + add);
        this.add = add;
        this.age = age;
        System.out.println("My age is " + this.age);
        System.out.println("my Address is " + this.add);

        System.out.println("This is my Parameterized Constructor");

    }

    public LearnConst(String add) {
        this.add = add;
        System.out.println("My address is " + this.add);

    }

    public static void main(String[] args) {
        LearnConst obj = new LearnConst();
        LearnConst obj1 = new LearnConst(35, "Canada");
        LearnConst obj2 = new LearnConst("USA");
        //obj.add="sdafasf";
        //System.out.println(obj.add);
    }


}
