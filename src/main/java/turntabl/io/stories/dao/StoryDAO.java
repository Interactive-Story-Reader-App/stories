package turntabl.io.stories.dao;

import turntabl.io.stories.models.StoryTO;

import java.util.List;

public interface StoryDAO {
    public void addNewStory();
    public List<StoryTO> getStories();
    public StoryTO searchForStoryByID();
}
