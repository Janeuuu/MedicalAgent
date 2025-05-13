package com.lvjuuu.java.ai.langchain4j.bean;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;

/**
 * @author lyj20
 * @date 2025/5/13 21:58
 */
@Data
public class ChatForm {

    private Long memoryId;
    private String message;

}
