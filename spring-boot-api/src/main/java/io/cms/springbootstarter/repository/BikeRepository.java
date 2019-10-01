package io.cms.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.cms.springbootstarter.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
 