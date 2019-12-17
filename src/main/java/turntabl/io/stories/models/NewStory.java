package turntabl.io.stories.models;

public class NewStory {
    private String story_title;
    private String story_description;
    private String category_id;
    private String author_id;
    private String story_photo;

    public NewStory() {
    }

    public NewStory(String story_title, String story_description, String category_id, String author_id, String story_photo) {
        this.story_title = story_title;
        this.story_description = story_description;
        this.category_id = category_id;
        this.author_id = author_id;
        this.story_photo = story_photo;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getStory_title() {
        return story_title;
    }

    public void setStory_title(String story_title) {
        this.story_title = story_title;
    }

    public String getStory_description() {
        return story_description;
    }

    public void setStory_description(String story_description) {
        this.story_description = story_description;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getStory_photo() {
        return story_photo;
    }

    public void setStory_photo(String story_photo) {
        this.story_photo = story_photo;
    }

    @Override
    public String toString() {
        return "NewStory{" +
                "story_title='" + story_title + '\'' +
                ", story_description='" + story_description + '\'' +
                ", category_id='" + category_id + '\'' +
                ", author_id='" + author_id + '\'' +
                ", story_photo='" + story_photo + '\'' +
                '}';
    }
}
