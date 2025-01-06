package com.ll.chatai.domain.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.ai.openai.OpenAiChatModel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@RequiredArgsConstructor
public class ChatController {
    private final OpenAiChatModel openAiChatModel;

//    @GetMapping("/ai")
//    public Map<String, String> chat(@RequestBody String message){
//        Map<String, String> responses=new HashMap<>();
//
//        String openAiResponse=openAiChatModel.call(message);
//        responses.put("openai(chatGPT-3.5) 응답",openAiResponse);
//
//        return responses;
//    }


}
