package com.infytel.friend.family.infitelfriendfamily.service;

import com.infytel.friend.family.infitelfriendfamily.dto.FriendFamilyDTO;
import com.infytel.friend.family.infitelfriendfamily.entity.FriendFamily;
import com.infytel.friend.family.infitelfriendfamily.repository.FriendFamilyRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class FriendFamilyServiceImp implements FriendFamilyService{

    Logger logger = LoggerFactory.getLogger(this.getClass());

    private ModelMapper modelMapper;
    private FriendFamilyRepository friendFamilyRepository;


    @Autowired
    public FriendFamilyServiceImp(ModelMapper modelMapper, FriendFamilyRepository repository){
        this.modelMapper = modelMapper;
        this.friendFamilyRepository = repository;
    }

    @Override
    public void saveFriend(Long phoneNo, FriendFamilyDTO friendDTO) {
        logger.info("Creation request for customer {} with data {}",phoneNo, friendDTO);
        friendDTO.setPhoneNo(phoneNo);
        FriendFamily friendFamily = modelMapper.map(friendDTO, FriendFamily.class);
        friendFamilyRepository.save(friendFamily);
    }

    @Override
    public List<Long> getFriends(Long phoneNo) {
        List<Long> friends = new ArrayList<>();
        List<FriendFamily> friendFamilyList = friendFamilyRepository.findAllByPhoneNo(phoneNo);
        friendFamilyList.forEach( friendFamily -> {
            friends.add(friendFamily.getFriendAndFamily());
        });
        return friends;
    }
}
