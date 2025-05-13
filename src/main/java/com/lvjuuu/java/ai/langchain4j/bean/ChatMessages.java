package com.lvjuuu.java.ai.langchain4j.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import nonapi.io.github.classgraph.json.Id;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

/**
 * @author lyj20
 * @date 2025/5/13 20:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("chat_messages")
public class ChatMessages {
    @Id
    private ObjectId Id;
    private int memoryId;
    private String content;
}
