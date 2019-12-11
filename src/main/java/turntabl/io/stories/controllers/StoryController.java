package turntabl.io.stories.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.extra.DBVars;
import turntabl.io.stories.extra.GenerateID;
import turntabl.io.stories.models.NewStory;
import turntabl.io.stories.models.StoryTO;

import java.util.List;

@RestController
public class StoryController {
    @Autowired
    JdbcTemplate template;

    @CrossOrigin
    @PostMapping("/api/v1/stories")
    public void addNewStory(@RequestBody NewStory story) {
        template.update(DBVars.ADD_NEW_STORY, GenerateID.getId(6), story.getStory_title(), story.getCategory_id(), story.getAuthor_id(), story.getStory_photo());
    }

    @CrossOrigin
    @GetMapping("/api/v1/stories")
    public List<StoryTO> getStories(){
        return this.template.query(
                DBVars.GET_ALL_STORIES,
                new BeanPropertyRowMapper<StoryTO>(StoryTO.class));
    }

    @CrossOrigin
    @GetMapping("/api/v1/stories/{id}")
    public StoryTO searchForStoryByID(@PathVariable("id") Integer id) {
        return (StoryTO) template.queryForObject(
                DBVars.GET_STORY_BY_ID,
                new Object[]{id},
                new BeanPropertyRowMapper(StoryTO.class));
    }

}
