package com.lvjuuu.java.ai.langchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;

/**
 * @author lyj20
 * @date 2025/5/13 21:52
 */
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,
        chatModel = "qwenChatModel",
        chatMemoryProvider = "medicalChatMemory"
)
public interface MedicalAssistant {
    @SystemMessage(fromResource = "system.txt")
    String chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
