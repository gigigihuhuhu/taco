package tacos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import tacos.entity.Ingredient;
import tacos.repository.IngredientRepository;

@Slf4j
@Controller
@RestController("/design")
public class DesignTacoController {
	@Autowired
	private IngredientRepository ingredientRepository;
	
	@GetMapping
	public List<Ingredient> getIngredient() {
		return ingredientRepository.findAll();
	}

}
