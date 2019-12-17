package turntabl.io.stories.controllers;

import com.cloudant.client.api.Database;
import com.cloudant.client.api.model.Response;
import com.cloudant.client.api.query.JsonIndex;
import com.cloudant.client.api.query.QueryBuilder;
import com.cloudant.client.api.query.QueryResult;
import com.cloudant.client.api.query.Sort;
import org.springframework.beans.factory.annotation.Autowired;;
import org.springframework.web.bind.annotation.*;
import turntabl.io.stories.models.NewStory;
import turntabl.io.stories.models.StoryTO;

import java.io.IOException;
import java.util.List;

import static com.cloudant.client.api.query.Expression.*;

@RestController
public class StoryController {
    @Autowired
    private Database db;

    @CrossOrigin
    @PostMapping("/api/v1/stories")
    public void addNewStory(@RequestBody NewStory story) {
        Response response = db.save(story);
    }

    @CrossOrigin
    @GetMapping("/api/v1/stories")
    public List<StoryTO> getStories() throws IOException {
        List<StoryTO> allStories = db.getAllDocsRequestBuilder().includeDocs(true).build().getResponse().getDocsAs(StoryTO.class);
        return allStories;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/v1/stories/{id}", method = RequestMethod.GET)
    public StoryTO searchForStoryByID(@PathVariable("id") String id) {
        return db.find(StoryTO.class, id);
    }

    @CrossOrigin
    @PatchMapping("/api/v1/stories/{id}")
    public void updateStory(@RequestBody StoryTO uStory, @PathVariable("id") String id) {
        StoryTO story = db.find(StoryTO.class, id);

        story.setAuthor_id(uStory.getAuthor_id());
        story.setStory_title(uStory.getStory_title());
        story.setStory_description(uStory.getStory_description());
        story.setCategory_id(uStory.getCategory_id());
        story.setStory_photo(uStory.getStory_photo());

        Response response = db.update(story);
    }

    @CrossOrigin
    @DeleteMapping("/api/v1/stories/{id}/{rev}")
    public void deleteStory(@PathVariable("id") String id, @PathVariable("rev") String rev) {
        Response response = db.remove(id, rev);
    }

    @CrossOrigin
    @RequestMapping(value = "/api/v1/stories/search", method = RequestMethod.GET)
    public QueryResult<StoryTO> searchForStoryByTitle(@RequestParam(value = "title") String title) {
        db.createIndex(JsonIndex.builder().asc("story_title").definition());

        QueryResult<StoryTO> story = db.query(new QueryBuilder(
                in("story_title", title)).
                sort(Sort.desc("story_title")).
                build(), StoryTO.class);
        return story;
    }


}
