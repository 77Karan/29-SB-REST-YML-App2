package in.ashokit.properties;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties(prefix="myapp")
@EnableConfigurationProperties
@Data
public class AppProps
{
	private Map<String,String> messages = new HashMap();

}
