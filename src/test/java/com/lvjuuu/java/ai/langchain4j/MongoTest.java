package com.lvjuuu.java.ai.langchain4j;

import com.lvjuuu.java.ai.langchain4j.bean.ChatMessages;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author lyj20
 * @date 2025/5/13 20:21
 */
@SpringBootTest
public class MongoTest {

    @Autowired
    private MongoTemplate mongoTemplate;
    @Test
    public void test() {
        ChatMessages chatMessages = new ChatMessages();
        chatMessages.setContent("hello world");
        mongoTemplate.insert(chatMessages);
    }
}
