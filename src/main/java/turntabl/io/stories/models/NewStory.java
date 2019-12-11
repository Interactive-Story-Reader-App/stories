package turntabl.io.stories.models;

public class NewStory {
    private String story_title;
    private Integer category_id;
    private Integer author_id;
    private String story_photo;

    public NewStory() {
    }

    public NewStory(String story_title, Integer category_id, Integer author_id, String story_photo) {
        this.story_title = story_title;
        this.category_id = category_id;
        this.author_id = author_id;
        this.story_photo = story_photo;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }

    public String getStory_title() {
        return story_title;
    }

    public void setStory_title(String story_title) {
        this.story_title = story_title;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getStory_photo() {
        return story_photo;
    }

    public void setStory_photo(String story_photo) {
        this.story_photo = story_photo;
    }
}
