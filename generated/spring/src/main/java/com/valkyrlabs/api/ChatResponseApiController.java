package com.valkyrlabs.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

    

import java.util.Optional;
// import jakarta.annotation.Generated;

// @Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-03T16:16:33.363267-08:00[America/Los_Angeles]", comments = "Generator version: 7.5.0")
    @Controller

    @RequestMapping("${openapi.valkyrAICORE.base-path:/v1}")
    public class ChatResponseApiController implements ChatResponseApi {

    protected static final Logger	logger	= LoggerFactory
        .getLogger(ChatResponseApiController.class);


        private final ChatResponseApiDelegate delegate;

        public ChatResponseApiController(@Autowired(required = false) ChatResponseApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ChatResponseApiDelegate() {});
        }

        @Override
        public ChatResponseApiDelegate getDelegate() {
        return delegate;
        }


    

        }