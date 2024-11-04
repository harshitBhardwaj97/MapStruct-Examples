package pojos;

public class SimpleSource {

    private String sourceName;
    private String sourceDescription;

    public SimpleSource(String sourceName, String sourceDescription) {
        this.sourceName = sourceName;
        this.sourceDescription = sourceDescription;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    @Override
    public String toString() {
        return "SimpleSource{" +
                "sourceName='" + sourceName + '\'' +
                ", sourceDescription='" + sourceDescription + '\'' +
                '}';
    }
}