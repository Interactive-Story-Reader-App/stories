package turntabl.io.stories.aws;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonService {
    public void getObj(AmazonS3 s3client) {
        String bucketName = "talktalesmedia";
        String objectName = "";
        String timestamp = "";
        s3client.putObject(bucketName, timestamp, objectName);

        try{
            S3Object s3Object = s3client.getObject(bucketName, objectName);
            S3ObjectInputStream inputStream = s3Object.getObjectContent();

            System.out.println("object copied to destination");
        } catch (SdkClientException e) {
            e.printStackTrace();
        }
    }
}
