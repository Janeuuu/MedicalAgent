package com.lvjuuu.java.ai.langchain4j.assistant;

import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

/**
 * @author lyj20$
 * @date 2025/5/13$ 16:57$
 */
@AiService(wiringMode = AiServiceWiringMode.EXPLICIT,chatModel = "qwenChatModel",chatMemory = "chatMemory")
public interface Assistant {
    String chat(String question);
}
