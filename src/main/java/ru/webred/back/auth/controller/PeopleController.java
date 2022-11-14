package ru.webred.back.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @GetMapping()
    public String Index(Model model)
    {
        // Получение всех записей из DAO и передача на представление
        return null;}
    @GetMapping("/{Id}")
        public String show(@PathVariable("Id")int Id, Model model){
        return null;
        // Получение 1 записи с Id и передача на отображение
    }
}
