package com.example.testandroidspring.repository;

import com.example.testandroidspring.api.person.PersonAPIService;
import com.example.testandroidspring.domain.Person;

import retrofit2.Call;

public class PersonRepository {
    public static Call<Person> getPerson(long id){
        return PersonAPIService.getInstance().getPerson(id);
    }
}
