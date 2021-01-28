package ru.malkollm.springbootbackend;

import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.malkollm.springbootbackend.service.PicnicAreaService;

import java.io.IOException;

@SpringBootApplication
public class SpringbootBackendApplication {

	public static void main(String[] args) throws IOException, JSONException {
		SpringApplication.run(SpringbootBackendApplication.class, args);

		PicnicAreaService picnicAreaService = new PicnicAreaService();
		picnicAreaService.getPicnicAreaFromOD();
	}

}
