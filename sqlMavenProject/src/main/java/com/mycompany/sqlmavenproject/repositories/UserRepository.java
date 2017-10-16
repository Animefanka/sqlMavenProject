/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sqlmavenproject.repositories;

import com.mycompany.sqlmavenproject.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Student
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
