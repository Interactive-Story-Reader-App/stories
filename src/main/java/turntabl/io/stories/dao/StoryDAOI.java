package turntabl.io.stories.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import turntabl.io.stories.extra.DBVars;
import turntabl.io.stories.models.StoryTO;

import java.util.List;

public class StoryDAOI implements StoryDAO{
    @Autowired
    JdbcTemplate template;

    @Override
    public void addNewStory() {

    }

    @Override
    public List<StoryTO> getStories() {
        return this.template.query(
                DBVars.GET_ALL_STORIES,
                new BeanPropertyRowMapper<StoryTO>(StoryTO.class));
    }

    @Override
    public StoryTO searchForStoryByID() {
        return null;
    }
}
