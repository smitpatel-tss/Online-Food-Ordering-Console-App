package model;

public enum CuisineType {
    PUNJABI("Punjabi"),
    GUJARATI("Gujarati"),
    CHINESE("Chinese"),
    SOUTH_INDIAN("South Indian"),
    ITALIAN("Italian"),
    FAST_FOOD("Fast Food");

    private final String displayName;

    CuisineType(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
