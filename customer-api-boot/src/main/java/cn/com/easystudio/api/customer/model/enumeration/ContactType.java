package cn.com.easystudio.api.customer.model.enumeration;

import java.util.HashMap;
import java.util.Map;

public enum ContactType {
    WORK_PHONE("W"), MOBILE_PHONE("M"), FAX("F"), HOME_PHONE("H"), EMAIL("E");

    private static Map<String, ContactType> map = new HashMap();
    private final String value;

    ContactType(String value) {
        this.value = value;
    }

    public static ContactType getContactType(String value) {
        return map.get(value);
    }

    public String getValue() {
        return value;
    }

    static {
        for (ContactType type : ContactType.values()) {
            map.put(type.value, type);
        }
    }
}
