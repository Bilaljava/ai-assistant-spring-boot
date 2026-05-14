package com.bilalibrahimov.ai_assistant;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chat")
@RequiredArgsConstructor
public class ChatController {

    private final ChatService chatService;

    @PostMapping
    public String chat(@RequestBody String message) {
        return chatService.chat(message);
    }
}
