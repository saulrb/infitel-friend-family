package com.infytel.friend.family.infitelfriendfamily.service;

import com.infytel.friend.family.infitelfriendfamily.dto.FriendFamilyDTO;

import java.util.List;

public interface FriendFamilyService {

    void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO);

    List<Long> getFriends(Long phoneNo);
}
