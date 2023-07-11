public class archive {
    
    private String identifier;
    private String name;

    public archive(String id, String itemName) {
        this.identifier = id;
        this.name = itemName;
    }

    public String getIdentifier() {
        return this.identifier;
    }

    public String getName() {
        return this.name;
    }

    public boolean equals (Object compared) {

        if (this == compared) {
            return true;
        }

        if (!(compared instanceof archive)) {
            return false;
        }

        archive item = (archive) compared;

        if (this.identifier.equals(item.identifier)) {
            return true;
        }
        
        return false;
    }

}
