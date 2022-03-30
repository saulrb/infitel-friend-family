package com.infytel.friend.family.infitelfriendfamily.controller;

import com.infytel.friend.family.infitelfriendfamily.dto.FriendFamilyDTO;
import com.infytel.friend.family.infitelfriendfamily.service.FriendFamilyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendFamilyController {
    Logger logger = LoggerFactory.getLogger(this.getClass());

    FriendFamilyService friendFamilyService;

    @Autowired
    public FriendFamilyController(FriendFamilyService friendFamilyService){
        this.friendFamilyService = friendFamilyService;
    }

    @PostMapping(value = "/customers/{phoneNo}/friends", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void saveFriend(@PathVariable Long phoneNo, @RequestBody FriendFamilyDTO friendDTO) {
        logger.info("Creation request for customer {} with data {}", phoneNo, friendDTO);
        friendFamilyService.saveFriend(phoneNo, friendDTO);
    }

    @GetMapping(value = "/friends/{phoneNo}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Long> getFriends(@PathVariable Long phoneNo) {
        logger.info("Get friends for a customer {} ",phoneNo);
        return friendFamilyService.getFriends(phoneNo);
    }

}
