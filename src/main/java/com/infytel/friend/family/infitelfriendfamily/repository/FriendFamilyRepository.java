package com.infytel.friend.family.infitelfriendfamily.repository;

import com.infytel.friend.family.infitelfriendfamily.entity.FriendFamily;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface FriendFamilyRepository extends PagingAndSortingRepository<FriendFamily, Long> {
    List<FriendFamily> findAllByPhoneNo(Long phoneId);
}
