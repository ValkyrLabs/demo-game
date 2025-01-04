package com.valkyrlabs.api;


import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import com.valkyrlabs.model.ThorUser;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.yaml.snakeyaml.Yaml;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * ThorAPI Data Methods for the special ThorUser needed to provide Spring
 * Security implementation.
 */
@Service
// @Transactional(readOnly = false)
public class ThorUserService implements UserDetailsService {

	protected static final Logger logger = LoggerFactory.getLogger(ThorUserService.class);
	
	private static final String BASE_CONFIG_YAML = "openapi/specs/ThorUX.yaml";

    public static String getBaseConfigYaml() {
        return BASE_CONFIG_YAML;
    }
	
	@Autowired
	private ThorUserRepository userRepository;

	/**
	 * Locates the user based on the username. In the actual implementation, the
	 * search may possibly be case sensitive, or case insensitive depending on how
	 * the implementation instance is configured. In this case, the
	 *
	 * <code>UserDetails</code>
	 *
	 * object that comes back may have a username that is of a different case than
	 * what was actually requested..
	 * 
	 * @param username the username identifying the user whose data is required.
	 * @return a fully populated user record (never <code>null</code>)
	 * @throws UsernameNotFoundException if the user could not be found or the user
	 *                                   has no GrantedAuthority
	 */
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("Loading ThorUser by username: {}", username);
		ThorUser userDetails = (ThorUser) userRepository.findThorUserByUsername(username);
        if(userDetails == null) {
            throw new UsernameNotFoundException("User not found");
        }
		return userDetails;
	}


    @Operation(operationId = "thorux-config", summary = "Retrieve a THORUX Session Component Map", description = "Retrieves a THORUX Session Component Map based upon user/role permissions and data model design", tags = {
        "THORUX Config" }, responses = {
                @ApiResponse(responseCode = "200", description = "Successfully retrieved the THORUX Session Component Map", content = {
                        @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ThorApplication.class)))
                }),
                @ApiResponse(responseCode = "404", description = "No THORUX Component Maps were found."),
                @ApiResponse(responseCode = "500", description = "Internal server error.")
        })
    @GetMapping(value = "/thorux-config", produces = { "application/json" })
    public CompletableFuture<ResponseEntity<Object>> getUiConfig(String id) {
        return CompletableFuture.supplyAsync(() -> {

            // convert to THORUX component configuration object
            JSONObject uiConfig = new JSONObject();
            try {
                uiConfig = convertToJson(
                        // parse OpenAPI spec yaml
                        parseOpenApiForUiConfig());
            } catch (IOException e) {
                logger.error("Failed to parse yaml" + e);
            }
            return new ResponseEntity<>(uiConfig, HttpStatus.OK);
        }, Runnable::run);

    }

    private static JSONObject convertToJson(String yamlString) {
        Yaml yaml = new Yaml();
        Map<String, Object> map = yaml.load(yamlString);
        return new JSONObject(map);
    }

    private String parseOpenApiForUiConfig() throws IOException {
        Path yamlPath = Paths.get(BASE_CONFIG_YAML);
        return Files.readString(yamlPath, StandardCharsets.UTF_8);
    }

    @Transactional
    public ThorUser findUserByUsername(String username) {
        return userRepository.findThorUserByUsername(username);
    }


    public ThorUser save(ThorUser user){
        return userRepository.save(user);
    }

    @Transactional
    public ThorUser findUserByEmail(String email) {

        if (email == null) {
            throw new IllegalArgumentException("Email cannot be null");
        }
        if (email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        // do some rudimentary validations...
        if ((email.indexOf(".") == -1) || (email.indexOf("@") == -1) || (email.indexOf("@") > email.indexOf("."))) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }

        return userRepository.findThorUserByEmail(email.toLowerCase());
    }
}