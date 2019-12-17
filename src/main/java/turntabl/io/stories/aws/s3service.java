package turntabl.io.stories.aws;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import jdk.nashorn.internal.runtime.Source;
import org.apache.tomcat.util.http.fileupload.FileUtils;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.AbstractMap;
import java.util.List;


public class s3service {
    void getObj(AmazonS3 s3client) {
        String bucketName = "talktalesmedia";
        String objectPath = "https://talktalesmedia.s3.eu-west-2.amazonaws.com/pictures";

//        try {
//            S3Object s3object = s3client.getObject(bucketName, objectPath);
//            S3ObjectInputStream inputStream = s3object.getObjectContent();
//
//
//            System.out.println("file copied to destination.");
//        }catch(Exception e) {
//            e.printStackTrace();
        }
//    }

    public void createFolder(String bucketName,  AmazonS3 client) {
//        // create meta-data for your folder and set content-length to 0

        ObjectMetadata metadata = new ObjectMetadata();
        metadata.setContentLength(0);

        // create empty content+
        InputStream emptyContent = new ByteArrayInputStream(new byte[0]);

        // create a PutObjectRequest passing the folder name
//        PutObjectRequest putObjectRequest = new PutObjectRequest(bucketName, emptyContent,
//                metadata);

        // send request to S3 to create folder
//        client.putObject(putObjectRequest);
    }

    public static void deleteFolder(String bucketName, String folderName, AmazonS3 client) {
        List fileList = client.listObjects(bucketName, folderName).getObjectSummaries();
        for (Object object : fileList) {
            S3ObjectSummary file = (S3ObjectSummary) object;
            client.deleteObject(bucketName, file.getKey());
        }
        client.deleteObject(bucketName, folderName);
    }

}








