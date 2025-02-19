package com.bio.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.bio.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}