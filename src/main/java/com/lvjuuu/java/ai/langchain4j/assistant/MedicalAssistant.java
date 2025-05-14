package com.lvjuuu.java.ai.langchain4j.assistant;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import dev.langchain4j.service.spring.AiService;
import dev.langchain4j.service.spring.AiServiceWiringMode;
import reactor.core.publisher.Flux;

/**
 * @author lyj20
 * @date 2025/5/13 21:52
 */
@AiService(
        wiringMode = AiServiceWiringMode.EXPLICIT,
        //chatModel = "qwenChatModel",
        streamingChatModel = "qwenStreamingChatModel",
        chatMemoryProvider = "medicalChatMemory",
        tools = "appointmentTools",
        contentRetriever = "contentRetrieverXiaozhiPincone"
)
public interface MedicalAssistant {
    @SystemMessage(fromResource = "system.txt")
    Flux<String> chat(@MemoryId Long memoryId, @UserMessage String userMessage);
}
