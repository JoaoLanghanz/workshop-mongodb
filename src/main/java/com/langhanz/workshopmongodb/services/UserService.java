package com.langhanz.workshopmongodb.services;

import com.langhanz.workshopmongodb.domain.User;
import com.langhanz.workshopmongodb.repository.UserRepository;
import com.langhanz.workshopmongodb.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){

        return repo.findAll();
    }

    public User findById(String id){
        Optional<User> user = repo.findById(id);

        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));

    }

}
