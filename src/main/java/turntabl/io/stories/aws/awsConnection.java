package turntabl.io.stories.aws;


import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.S3ObjectSummary;
import com.sun.tools.sjavac.Log;

import java.io.File;
import java.io.IOException;


public class awsConnection {

    public static void main(String[] args) throws IOException {

        s3service s3service = new s3service();

        AWSCredentials credentials = new BasicAWSCredentials("", "");
        AmazonS3 s3client = AmazonS3ClientBuilder
                .standard()
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .withRegion(Regions.EU_WEST_2)
                .build();

        String bucketName = "/talktalesmedia/pictures";


        if(s3client.doesBucketExistV2(bucketName)) {


            // upload file to folder and set it to public

            s3client.putObject(
                    new PutObjectRequest(bucketName, "testImage.jpeg", new File("/home/mrford/Downloads/ss.jpeg"))
                            .withCannedAcl(CannedAccessControlList.PublicRead));
                            System.out.println("Execution Completed");


//            s3service.getObj(s3client);
        }else {
            Log.info("Bucket name is not available.");
        }
    }


}
