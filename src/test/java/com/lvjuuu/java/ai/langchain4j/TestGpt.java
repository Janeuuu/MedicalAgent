package com.lvjuuu.java.ai.langchain4j;

import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import dev.langchain4j.model.openai.OpenAiChatModel;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lyj20
 * @date 2025/5/12 23:28
 */
@SpringBootTest
public class TestGpt {
//    @Test
//    public void testGpt() {
//        OpenAiChatModel model = OpenAiChatModel.builder()
//                .baseUrl("http://langchain4j.dev/demo/openai/v1")
//                .apiKey("demo")
//                .modelName("gpt-4o-mini")
//                .build();
//        System.out.println(model.chat("你是谁" ));
//    }

    @Autowired
    private OpenAiChatModel openAiChatModel;

    @Test
    public void testGpt2() {
        //向模型提问
        String answer = openAiChatModel.chat("你好");//输出结果
        System.out.println(answer);
    }
    @Autowired
    private OllamaChatModel ollamaChatModel;
    @Test
    public void testGpt3() {
        //向模型提问
        String answer = ollamaChatModel.chat("你是谁" );//输出结果
        System.out.println(answer);
    }
    @Autowired
    private QwenChatModel qwenChatModel;
    @Test
    public void testGpt4() {
        //向模型提问
        String answer = qwenChatModel.chat("你是谁" );//输出结果
        System.out.println(answer);
    }






}
