package upf.edu.uploader;

import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.PutObjectRequest;

import java.util.List;

public class S3Uploader implements Uploader{
    private String BucketName;
    private String Prefix;
    private String Credentials;

    @Override
    public void upload(List<String> files) {
        for (String file : files){

        }
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withCredentials(new ProfileCredentialsProvider("upf"))
                .build();

        if(s3Client.doesBucketExistV2(this.BucketName)) {
            System.out.println("This bucket doesn't exist");
        }
        else{
            for (String file : files){
                PutObjectRequest request = PutObjectRequest.
            }
        }

}
