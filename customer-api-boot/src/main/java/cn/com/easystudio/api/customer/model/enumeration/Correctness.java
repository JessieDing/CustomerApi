package cn.com.easystudio.api.customer.model.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum Correctness {
    CORRECT("C"), POSSIBLY_CORRECT("P"), INCORRECT("I");

    private static Map<String, Correctness> map = new HashMap();
    private final String value;

    Correctness(String value) {
        this.value = value;
    }

    public static Correctness getCorrectness(String value) {
        return map.get(value);
    }

    static {
        for (Correctness accuracy : Correctness.values()) {
            map.put(accuracy.value, accuracy);
        }
    }

    public String getValue() {
        return value;
    }
}
