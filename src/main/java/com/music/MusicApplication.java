package com.music;
// Prateek
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**com.music is the package we choose since we use both com.music.album
 * and com.music.song packages that are within com.music.
 */
@EnableJpaRepositories(basePackages = "com.music")
@SpringBootApplication
public class MusicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicApplication.class, args);
	}

}
