package turntabl.io.stories.aws;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;


public class awsClient {
    AWSCredentials credentials = new BasicAWSCredentials("AKIAJYKN6JAZ4H3WCM7A", "e9cRnvMleA3B0VN4EODa05OOHLxCXm9KbZsdcwXX");
    AmazonS3 s3client = AmazonS3ClientBuilder
                        .standard()
                        .withCredentials(new AWSStaticCredentialsProvider(credentials))
                        .withRegion(Regions.EU_WEST_2)
                        .build();

}
