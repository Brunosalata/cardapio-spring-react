package br.com.brunosalata.cardapio.controller;

import br.com.brunosalata.cardapio.food.Food;
import br.com.brunosalata.cardapio.food.FoodRepository;
import br.com.brunosalata.cardapio.food.FoodRequestDTO;
import br.com.brunosalata.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Bruno Salata Lima
 * github.com/Brunosalata
 */

@RestController
@RequestMapping("food")  //Definição do Endpoint
public class FoodController {
    @Autowired
    private FoodRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping         // Método GET no Endopoint "food"
    public List<FoodResponseDTO> getAll(){
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }
}
