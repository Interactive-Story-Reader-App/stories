package turntabl.io.stories.aws;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class s3client {
    CommonService commonService = new CommonService();

    AWSCredentials credentials = new BasicAWSCredentials("AKIAJYKN6JAZ4H3WCM7A", "e9cRnvMleA3B0VN4EODa05OOHLxCXm9KbZsdcwXX");

    AmazonS3 awsclient = AmazonS3ClientBuilder
            .standard()
            .withCredentials(new AWSStaticCredentialsProvider(credentials))
            .withRegion("US_EAST_2")
            .build();


    String bucketname = "talktalesmedia";
    

}



