import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {

    public String id;
    public String text;
    public String type;
    public String user;
    public int upvotes;

    public Employee(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upvotes
    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "{" + "\n" +
                "  \"id\": " + id + "\n" +
                "  \"text\": \"" + text + '\"' + "\n" +
                "  \"type\": \"" + type + '\"' + "\n" +
                "  \"user\": \"" + user + '\"' + "\n" +
                "  \"upvotes\": " + upvotes + "\n" +
                "},";
    }
}
