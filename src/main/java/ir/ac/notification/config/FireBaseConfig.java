package ir.ac.notification.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Configuration
public class FireBaseConfig {
    @Bean
    public  FirebaseApp init() throws IOException {
        FileInputStream serviceAccount =
                new FileInputStream("C://Users//Hitech//IdeaProjects//notification//src//main//resources//notification2-e5efd-firebase-adminsdk-fbsvc-618139eff6.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .build();

        return FirebaseApp.initializeApp(options);


    }
}
