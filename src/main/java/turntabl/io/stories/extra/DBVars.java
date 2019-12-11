package turntabl.io.stories.extra;

public class DBVars {
    public static String GET_ALL_STORIES = "select * from stories";
    public static String ADD_NEW_STORY = "insert into stories " +
            "(story_id, story_title, category_id, author_id, " +
            "story_photo) values (?, ?, ?, ?, ?)";
    public static String GET_STORY_BY_ID = "select * from stories where story_id = ? ";
}
