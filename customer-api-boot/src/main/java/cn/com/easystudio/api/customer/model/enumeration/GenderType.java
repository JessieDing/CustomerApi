package cn.com.easystudio.api.customer.model.enumeration;

public enum GenderType {
    MALE("M"),
    FEMALE("F"),
    UNKNOWN("U");

    private String value;

    GenderType(String value) {
        this.value = value;
    }

    public static GenderType getGender(String value) {
        if (MALE.value.equals(value)) {
            return MALE;
        }
        if (FEMALE.value.equals(value)) {
            return FEMALE;
        }
        return UNKNOWN;
    }

    public String getValue() {
        return value;
    }
}
