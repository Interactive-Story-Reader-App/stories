package turntabl.io.stories.dao;

import org.springframework.beans.factory.annotation.Autowired;
import turntabl.io.stories.extra.DBVars;
import turntabl.io.stories.models.StoryTO;

import java.util.List;

public class StoryDAOI implements StoryDAO{

    @Override
    public void addNewStory() {

    }

    @Override
    public List<StoryTO> getStories() {
        return null;
    }

    @Override
    public StoryTO searchForStoryByID() {
        return null;
    }
}
