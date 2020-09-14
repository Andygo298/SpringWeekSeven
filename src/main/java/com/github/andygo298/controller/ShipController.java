package com.github.andygo298.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.github.andygo298.model.SpaceShip;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@RestController
@RequestMapping("/task")
public class ShipController {

    @PostMapping(value = "/upload")
    public ResponseEntity<Object> getTask() throws IOException, URISyntaxException, ClassNotFoundException {

        ObjectMapper objectMapper = new ObjectMapper();
        Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader()
                .getResource("task.json")).toURI());
        File file = new File(String.valueOf(path));

        final String json = "{\"type\":}";
        final ObjectNode node = new ObjectMapper().readValue(json, ObjectNode.class);

        Object type = objectMapper.readValue(file, Class.forName(String.valueOf(node.get("type"))));

        return ResponseEntity.ok(type);
    }

}
