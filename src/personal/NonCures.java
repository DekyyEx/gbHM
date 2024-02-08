package personal;

public interface NonCures {
    public static final String type = "NonCures";
    void nonCures();
    default String getNonCure(){return "Младший персонал";

    }
}
