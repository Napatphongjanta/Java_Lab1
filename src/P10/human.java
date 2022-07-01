package P10;

public class human {
    String name;
    int age;
    public human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        human jimon = new human("warawut",20);
        human earn = new human("Thidatrip",20);
        jimon.name = "warawut";
        jimon.age = 20;
        System.out.println("Human name is "+ jimon.name);
        System.out.println("Human age is "+ jimon.age  );
        System.out.println("Human name is "+ earn.name);
        System.out.println("Human age is "+ earn.age  );
    }





}
