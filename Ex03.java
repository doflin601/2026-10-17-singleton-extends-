package qqq;

class Info {
    private String name;
    private int age;
    private String address;

    public Info() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

public class Ex03 {
    static void main(String[] args) {
        Info info = new Info();
        info.setName("홍길동");
        info.setAge(22);
        info.setAddress("대구광역시");

        System.out.println(info.getName());
        System.out.println(info.getAge());
        System.out.println(info.getAddress());

    }
}
