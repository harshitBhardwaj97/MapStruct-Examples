package pojos;

public class SimpleDestination {

    private String destinationName;
    private String destinationDescription;

    public SimpleDestination(String destinationName, String destinationDescription) {
        this.destinationName = destinationName;
        this.destinationDescription = destinationDescription;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationDescription() {
        return destinationDescription;
    }

    public void setDestinationDescription(String destinationDescription) {
        this.destinationDescription = destinationDescription;
    }

    @Override
    public String toString() {
        return "SimpleDestination{" +
                "destinationName='" + destinationName + '\'' +
                ", destinationDescription='" + destinationDescription + '\'' +
                '}';
    }
}