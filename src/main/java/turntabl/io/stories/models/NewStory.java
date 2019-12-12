package turntabl.io.stories.models;

public class NewStory {
    private String story_title;
    private String category_id;
    private String author_id;
    private String story_photo;

    public NewStory() {
    }

    public NewStory(String story_title, String category_id, String author_id, String story_photo) {
        this.story_title = story_title;
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
                ", story_title='" + story_title + '\'' +
                ", category_id=" + category_id +
                ", author_id=" + author_id +
                ", story_photo='" + story_photo + '\'' +
                '}';
    }
}
