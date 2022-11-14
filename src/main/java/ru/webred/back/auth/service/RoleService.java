package ru.webred.back.auth.service;

import org.springframework.stereotype.Service;

@Service
public interface RoleService {
    Long getByCode(String code);
}
