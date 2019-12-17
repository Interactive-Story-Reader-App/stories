package turntabl.io.stories.models;

import java.util.Arrays;

public class StoryTO {
    private String _id;
    private String _rev;
    private String story_title;
    private String story_description;
    private String story_category;
    private String author_id;
    private String story_photo;
    private String status;

    public StoryTO() {
    }

    public StoryTO(String _id, String _rev, String story_title, String story_description, String story_category, String author_id, String story_photo, String status) {
        this._id = _id;
        this._rev = _rev;
        this.story_title = story_title;
        this.story_description = story_description;
        this.story_category = story_category;
        this.author_id = author_id;
        this.story_photo = story_photo;
        this.status = status;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_rev() {
        return _rev;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
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

    public String getStory_category() {
        return story_category;
    }

    public void setStory_category(String story_category) {
        this.story_category = story_category;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
    }

    public String getStory_photo() {
        return story_photo;
    }

    public void setStory_photo(String story_photo) {
        this.story_photo = story_photo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StoryTO{" +
                "_id='" + _id + '\'' +
                ", _rev='" + _rev + '\'' +
                ", story_title='" + story_title + '\'' +
                ", story_description='" + story_description + '\'' +
                ", story_category='" + story_category + '\'' +
                ", author_id='" + author_id + '\'' +
                ", story_photo='" + story_photo + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
