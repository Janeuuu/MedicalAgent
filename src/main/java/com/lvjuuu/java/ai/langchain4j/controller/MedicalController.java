package com.lvjuuu.java.ai.langchain4j.controller;

import com.lvjuuu.java.ai.langchain4j.assistant.MedicalAssistant;
import com.lvjuuu.java.ai.langchain4j.bean.ChatForm;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lyj20
 * @date 2025/5/13 21:59
 */

@Tag(name = "医疗智能助手")
@RestController
@RequestMapping("/xiaozhi")
public class MedicalController {
    @Autowired
    private MedicalAssistant medicalAssistant;

    @Operation(summary = "对话")
    @PostMapping("/chat")
    public String chat(@RequestBody ChatForm chatForm) {
        return medicalAssistant.chat(chatForm.getMemoryId(),  chatForm.getMessage());
    }

}
