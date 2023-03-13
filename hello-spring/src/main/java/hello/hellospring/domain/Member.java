package hello.hellospring.domain;

public class Member {
    private long id;
    private String name;

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Member.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Member.name = name;
    }
}
