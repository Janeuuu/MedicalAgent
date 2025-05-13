package com.lvjuuu.java.ai.langchain4j.config;

import com.lvjuuu.java.ai.langchain4j.store.MongoChatMemoryStore;
import dev.langchain4j.memory.chat.ChatMemoryProvider;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lyj20
 * @date 2025/5/13 21:53
 */
@Configuration
public class MedicalChatMemoryConfig {

    @Autowired
    private MongoChatMemoryStore mongoChatMemoryStore;
    @Bean
    public ChatMemoryProvider medicalChatMemory() {
        return memoryId-> MessageWindowChatMemory.builder()
                .id(memoryId)
                .maxMessages(20)
                .chatMemoryStore(mongoChatMemoryStore)  //使用mongoDB持久化
                .build();
    }
}
