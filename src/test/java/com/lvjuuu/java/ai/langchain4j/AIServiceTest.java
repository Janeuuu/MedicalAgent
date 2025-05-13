package com.lvjuuu.java.ai.langchain4j;

import com.lvjuuu.java.ai.langchain4j.assistant.Assistant;
import com.lvjuuu.java.ai.langchain4j.assistant.SeparateChatAssistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lyj20
 * @date 2025/5/13 16:58
 */

@SpringBootTest
public class AIServiceTest {

    @Autowired
    private Assistant assistant;
    @Autowired
    private SeparateChatAssistant separateChatAssistant;
    @Test
    public void testGpt() {
        String answer = assistant.chat("我是六六六");
        System.out.println(answer);
        String answer2 = assistant.chat("我是谁");
        System.out.println(answer2);
    }
    @Test
    public void testGpt2() {
        String answer = separateChatAssistant.chat(4,"今天几号");
        System.out.println(answer);
//        String answer2 = separateChatAssistant.chat(3,"我是谁");
//        System.out.println(answer2);
//        String answer3 = separateChatAssistant.chat(2,"我是谁");
//        System.out.println(answer3);
    }
}
