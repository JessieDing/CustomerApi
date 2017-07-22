package cn.com.easystudio.api.customer.model.enumeration;

public enum CustomerType {
    INDIVIDUAL("I"),
    ORGANISATION("O");

    private String value;

    CustomerType(String value) {
        this.value = value;
    }

    public static CustomerType getCustomerType(String value) {
        if (INDIVIDUAL.value.equals(value)) {
            return INDIVIDUAL;
        }
        if (ORGANISATION.value.equals(value)) {
            return ORGANISATION;
        }
        return null;
    }

    public String getValue() {
        return value;
    }
}
